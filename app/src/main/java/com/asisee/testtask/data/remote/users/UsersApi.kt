package com.asisee.testtask.data.remote.users

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query

interface UsersApi {
    /**
     * Fetch a page of users
     * @param page - page to fetch
     * @param count - number of elements to fetch
     */
    @GET("users")
    suspend fun getUsers(@Query("page") page: Int, @Query("count") count: Int) : UsersResponse

    /**
     * Register a new user
     */
    @Multipart
    @POST("users")
    suspend fun registerUser(
        @Header("Token") token: String,
        @Part("name") name: RequestBody,
        @Part("email") email: RequestBody,
        @Part("phone") phone: RequestBody,
        @Part("position_id") position_id: RequestBody,
        @Part image: MultipartBody.Part,
    ) : Response<SignUpResponse>
}