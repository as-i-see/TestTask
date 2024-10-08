package com.asisee.testtask.presentation.ui.signup

import android.Manifest
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.asisee.testtask.R
import com.asisee.testtask.presentation.common.ImageCropView
import com.asisee.testtask.presentation.common.PhotoPickerBottomSheet
import com.asisee.testtask.presentation.common.PhotoPickerField
import com.asisee.testtask.presentation.common.RadioButton
import com.asisee.testtask.presentation.common.TextField
import com.asisee.testtask.presentation.common.TopBar
import com.asisee.testtask.presentation.common.createTempFile
import com.asisee.testtask.presentation.common.getUriForFile
import com.asisee.testtask.presentation.theme.Black87
import com.asisee.testtask.presentation.theme.Blue
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel


private var capturedPhotoUri = Uri.EMPTY

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(toSignUpResult: (Int) -> Unit) {
    val viewModel = koinViewModel<SignUpViewModel>()
    var name by viewModel.name
    var email by viewModel.email
    var phone by viewModel.phone
    val nameErrorText by viewModel.nameErrorText.collectAsStateWithLifecycle()
    val emailErrorText by viewModel.emailErrorText.collectAsStateWithLifecycle()
    val phoneErrorText by viewModel.phoneErrorText.collectAsStateWithLifecycle()
    val positions by viewModel.positions.collectAsStateWithLifecycle()
    val selectedPosition by viewModel.selectedPosition.collectAsStateWithLifecycle()
    val photoPickerErrorText by viewModel.photoPickerErrorText.collectAsStateWithLifecycle()
    val photoBitmap by viewModel.photoBitmap.collectAsStateWithLifecycle()
    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val pickMedia = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
        if (uri != null) {
            viewModel.cropPhoto(uri)
        }
    }
    val cameraLauncher = rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) { success ->
        if (success) {
            viewModel.cropPhoto(capturedPhotoUri)
        }
    }
    val permissionLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
        if (isGranted) {
            capturedPhotoUri = context.getUriForFile(context.createTempFile())
            cameraLauncher.launch(capturedPhotoUri)
        } else {
            Toast.makeText(context, context.getString(R.string.permission_denied), Toast.LENGTH_SHORT).show()
        }
    }
    val imageCropData by viewModel.imageCropData.collectAsStateWithLifecycle()
    val isUploading by viewModel.isUploading.collectAsStateWithLifecycle()
    val scope = rememberCoroutineScope()
    imageCropData?.let { imageCropData -> // cropping now
        ImageCropView(
            imageCropData = imageCropData,
            onCancel = {
                viewModel.cancelCrop()
            },
            onCrop = {
                viewModel.onCrop()
            }
        )
    }
    if (imageCropData == null) { // not cropping now
        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = {
                    showBottomSheet = false
                },
                sheetState = sheetState,
                containerColor = Color.White,
            ) {
                PhotoPickerBottomSheet(
                    hideBottomSheet = {
                        scope.launch { sheetState.hide() }.invokeOnCompletion {
                            if (!sheetState.isVisible) {
                                showBottomSheet = false
                            }
                        }
                    },
                    cameraAction = {
                        permissionLauncher.launch(Manifest.permission.CAMERA)
                    },
                    galleryAction = {
                        pickMedia.launch(
                            PickVisualMediaRequest(
                                ActivityResultContracts.PickVisualMedia.SingleMimeType("image/jpeg")
                            )
                        )
                    }
                )
            }
        }
        Column(Modifier.fillMaxSize()) {
            TopBar(stringResource(R.string.signup_top_bar))
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(start = 16.dp, top = 32.dp, end = 16.dp, bottom = 32.dp)
            ) {
                TextField(
                    value = name,
                    onValueChange = {
                        name = it
                        viewModel.cleanNameError()
                    },
                    label = stringResource(R.string.your_name),
                    supportingText = "",
                    errorText = nameErrorText,
                    isError = nameErrorText.isNotEmpty(),
                    isDigitsOnly = false
                )
                Spacer(Modifier.height(12.dp))
                TextField(
                    value = email,
                    onValueChange = {
                        email = it
                        viewModel.cleanEmailError()
                    },
                    label = stringResource(R.string.email),
                    supportingText = "",
                    errorText = emailErrorText,
                    isError = emailErrorText.isNotEmpty(),
                    isDigitsOnly = false,
                )
                Spacer(Modifier.height(12.dp))
                TextField(
                    value = phone,
                    onValueChange = {
                        phone = it
                        viewModel.cleanPhoneError()
                    },
                    label = stringResource(R.string.phone),
                    supportingText = stringResource(R.string.phone_supporting_text),
                    errorText = phoneErrorText,
                    isError = phoneErrorText.isNotEmpty(),
                    isDigitsOnly = true,
                )

                Spacer(Modifier.height(24.dp))

                Text(
                    text = stringResource(R.string.select_your_position),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Black87
                )
                Spacer(Modifier.height(12.dp))
                Column(Modifier.selectableGroup()) {
                    positions.forEach { position ->
                        selectedPosition?.let {
                            RadioButton(
                                position = position,
                                selectedOption = it,
                                onOptionSelected = viewModel::setPosition,
                            )
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))

                if (photoBitmap == null) {
                    PhotoPickerField(
                        errorText = photoPickerErrorText,
                        isError = photoPickerErrorText.isNotEmpty(),
                        onPick = {
                            viewModel.cleanPhotoPickerError()
                            showBottomSheet = true
                        }
                    )
                } else {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            bitmap = photoBitmap!!.asImageBitmap(),
                            contentDescription = stringResource(R.string.photo),
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .width(56.dp)
                                .aspectRatio(1f)
                                .clickable {
                                    showBottomSheet = true
                                }
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        modifier = Modifier
                            .width(140.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(24.dp),
                        onClick = {
                            if (!isUploading)
                                viewModel.signUp(toSignUpResult)
                        },
                    ) {
                        if (isUploading)
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                color = Blue,
                            )
                        else Text(
                            text = stringResource(R.string.sign_up),
                            style = MaterialTheme.typography.bodyLarge,
                            color = Black87,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }

}