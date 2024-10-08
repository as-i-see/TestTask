package com.asisee.testtask.di

import android.content.Context
import androidx.room.Room
import com.asisee.testtask.data.local.LocalDatabase
import com.asisee.testtask.data.remote.positions.PositionsApi
import com.asisee.testtask.data.remote.token.TokenApi
import com.asisee.testtask.data.remote.users.UsersApi
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@ComponentScan("com.asisee.testtask.data")
class DataModule {
    @Single
    fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://frontend-test-assignment-api.abz.agency/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Single
    fun usersApi(retrofit: Retrofit) = retrofit.create(UsersApi::class.java)

    @Single
    fun positionsApi(retrofit: Retrofit) = retrofit.create(PositionsApi::class.java)

    @Single
    fun tokenApi(retrofit: Retrofit) = retrofit.create(TokenApi::class.java)

    @Single
    fun localDatabase(context: Context) = Room.databaseBuilder(
            context,
            LocalDatabase::class.java, "test.db"
        ).fallbackToDestructiveMigration().build()
}