package com.asisee.testtask.data.remote.token

import retrofit2.http.GET

interface TokenApi {
    /**
     * Get token for registration
     */
    @GET("token")
    suspend fun getToken() : TokenResponse
}