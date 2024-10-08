package com.asisee.testtask.domain.repository.users

import android.graphics.Bitmap
import androidx.paging.PagingData
import com.asisee.testtask.data.User
import kotlinx.coroutines.flow.Flow

interface UsersRepository {
    fun getUsers() : Flow<PagingData<User>>

    suspend fun registerUser(
        name: String,
        email: String,
        phone: String,
        position_id: Int,
        photo: Bitmap
    ) : SignUpResult
}