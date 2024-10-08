package com.asisee.testtask.presentation.ui.signup

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.util.Patterns
import androidx.compose.runtime.mutableStateOf
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asisee.testtask.R
import com.asisee.testtask.data.remote.positions.Position
import com.asisee.testtask.domain.repository.positions.RemotePositionsRepository
import com.asisee.testtask.domain.repository.users.SignUpResult
import com.asisee.testtask.domain.repository.users.UsersRepository
import com.asisee.testtask.presentation.common.ImageCropData
import com.image.cropview.ImageCrop
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SignUpViewModel(
    private val context: Context,
    private val remotePositionsRepository: RemotePositionsRepository,
    private val usersRepository: UsersRepository,
) : ViewModel() {
    val name = mutableStateOf("")
    val email = mutableStateOf("")
    val phone = mutableStateOf("")

    private val _nameErrorText = MutableStateFlow("")
    val nameErrorText = _nameErrorText.asStateFlow()
    fun cleanNameError() {
        _nameErrorText.value = ""
    }
    private val _emailErrorText = MutableStateFlow("")
    val emailErrorText = _emailErrorText.asStateFlow()
    fun cleanEmailError() {
        _emailErrorText.value = ""
    }
    private val _phoneErrorText = MutableStateFlow("")
    val phoneErrorText = _phoneErrorText.asStateFlow()
    fun cleanPhoneError() {
        _phoneErrorText.value = ""
    }
    private var _positions = MutableStateFlow(emptyList<Position>())
    val positions = _positions.asStateFlow()

    private var _selectedPosition = MutableStateFlow<Position?>(null)
    val selectedPosition = _selectedPosition.asStateFlow()


    private var _photoBitmap = MutableStateFlow<Bitmap?>(null)
    val photoBitmap = _photoBitmap.asStateFlow()

    private val _photoPickerErrorText = MutableStateFlow("")
    val photoPickerErrorText = _photoPickerErrorText.asStateFlow()
    fun cleanPhotoPickerError() {
        _photoPickerErrorText.value = ""
    }

    private val _imageCropData = MutableStateFlow<ImageCropData?>(null)
    val imageCropData = _imageCropData.asStateFlow()

    private val _isUploading = MutableStateFlow(false)
    val isUploading = _isUploading.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            remotePositionsRepository.getPositions()?.let {
                _positions.value = it
                _selectedPosition.value = it[0]
            }
        }
    }

    fun setPosition(position: Position) {
        _selectedPosition.value = position
    }

    fun cropPhoto(uri: Uri) {
        viewModelScope.launch(Dispatchers.IO) {
            val bitmap = MediaStore.Images.Media.getBitmap(context.contentResolver, uri)
            val imageCrop = ImageCrop(bitmap)
            _imageCropData.value = ImageCropData(imageCrop, bitmap.width.toFloat() / bitmap.height)
        }
    }

    fun cancelCrop() {
        _imageCropData.value = null
    }

    fun onCrop() = viewModelScope.launch(Dispatchers.IO) {
        imageCropData.value?.let {
            val bitmap = it.imageCrop.onCrop()
            if (bitmap.width < 70 || bitmap.height < 70) {
                _photoPickerErrorText.value =
                    context.getString(R.string.minimum_size_of_photo_is_70x70px)
            } else if (bitmap.byteCount > 5000000) {
                _photoPickerErrorText.value =
                    context.getString(R.string.photo_size_must_not_be_greater_than_5_mb)
            } else {
                _photoBitmap.value = bitmap
            }
            cancelCrop()
        }
    }

    fun signUp(
        toSignUpResult: (Int) -> Unit
    ) {
        var isError = false
        val name = name.value
        if (name.length !in 2..60) {
            isError = true
            if (name.isEmpty()) {
                _nameErrorText.value = context.getString(R.string.required_field)
            } else {
                _nameErrorText.value =
                    context.getString(R.string.username_should_contain_2_60_characters)
            }
        }
        val email = email.value
        if (email.isEmpty()) {
            isError = true
            _emailErrorText.value = context.getString(R.string.required_field)
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            isError = true
            _emailErrorText.value = context.getString(R.string.invalid_email_format)
        }
        val phone = phone.value
        if (phone.isEmpty()) {
            isError = true
            _phoneErrorText.value = context.getString(R.string.required_field)
        } else if (!phone.isDigitsOnly() || phone.length != 10 || phone.first() != '0') {
            isError = true
            _phoneErrorText.value =
                context.getString(R.string.should_start_with_0_and_contain_only_digits)
        }
        val position = selectedPosition.value
        if (position == null) {
            isError = true
        }
        val photoBitmap = photoBitmap.value
        if (photoBitmap == null) {
            isError = true
            _photoPickerErrorText.value = context.getString(R.string.photo_is_required)
        }
        if (!isError) {
            _isUploading.value = true
            viewModelScope.launch(Dispatchers.IO) {
                val response = usersRepository.registerUser(
                    name,
                    email,
                    "38$phone",
                    position!!.id,
                    photoBitmap!!
                )
                when (response) {
                    SignUpResult.Success -> {
                        toSignUpResult(0)
                    }
                    SignUpResult.TokenExpired -> {
                        toSignUpResult(2)
                    }
                    SignUpResult.EmailAlreadyRegistered -> {
                        toSignUpResult(1)
                    }
                    is SignUpResult.ValidationError -> {
                        val fails = response.fails
                        fails.name?.first()?.let {
                            _nameErrorText.value = it
                        }
                        fails.email?.first()?.let {
                            _emailErrorText.value = it
                        }
                        fails.phone?.first()?.let {
                            _phoneErrorText.value = it
                        }
                        fails.photo?.first()?.let {
                            _photoPickerErrorText.value = it
                        }
                    }
                }
                _isUploading.value = false
            }
        }
    }
}

