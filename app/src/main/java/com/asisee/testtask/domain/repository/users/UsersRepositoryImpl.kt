package com.asisee.testtask.domain.repository.users

import android.content.Context
import android.graphics.Bitmap
import androidx.paging.Pager
import androidx.paging.PagingData
import com.asisee.testtask.data.User
import com.asisee.testtask.data.remote.token.TokenApi
import com.asisee.testtask.data.remote.users.SignUpResponse
import com.asisee.testtask.data.remote.users.UsersApi
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.koin.core.annotation.Single
import retrofit2.Response
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.UUID

const val PAGE_KEY_ID = 1

@Single
class UsersRepositoryImpl(
    private val context: Context,
    private val userPager: Pager<Int, User>,
    private val usersApi: UsersApi,
    private val tokenApi: TokenApi,
) : UsersRepository {
    override fun getUsers(): Flow<PagingData<User>> = userPager.flow

    override suspend fun registerUser(
        name: String,
        email: String,
        phone: String,
        position_id: Int,
        photo: Bitmap
    ): SignUpResult {
        var token : String
        val photoFile = saveBitmapToFile(photo)
        val name = createRequestBodyFromString(name)
        val email = createRequestBodyFromString(email)
        val phone = createRequestBodyFromString(phone)
        val position_id = createRequestBodyFromString(position_id.toString())
        val image = MultipartBody.Part.createFormData("photo", photoFile.name, photoFile.asRequestBody("image/jpeg".toMediaTypeOrNull()))
        var tries = 0
        var response: Response<SignUpResponse>
        do {
            token = tokenApi.getToken().token
            response = usersApi.registerUser(
                token = token,
                name = name,
                email = email,
                phone = phone,
                position_id = position_id,
                image = image
            )
            tries++
        } while (response.code() == 401 && tries < 100)
        return if (response.isSuccessful) {
            SignUpResult.Success
        } else if (response.code() == 409){
            SignUpResult.EmailAlreadyRegistered
        } else if (response.code() == 401){
            SignUpResult.TokenExpired
        } else {
            val errorBody = response.errorBody()!!.string()
            val response = Gson().fromJson(errorBody, SignUpResponse::class.java)
            SignUpResult.ValidationError(response.fails!!)
        }
    }

    private fun createRequestBodyFromString(data: String): RequestBody {
        return data.toRequestBody("text/plain".toMediaTypeOrNull())
    }

    private suspend fun saveBitmapToFile(bitmap: Bitmap) : File = withContext(Dispatchers.IO) {
        val fileName = "${UUID.randomUUID()}_image.jpg"
        val f = File(context.cacheDir, fileName);
        f.createNewFile();
        val bos = ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 0, bos);
        val bitmapData = bos.toByteArray()
        FileOutputStream(f).use { fos ->
            fos.write(bitmapData)
            fos.flush();
        }
        f
    }
}