package com.asisee.testtask.data.remote.positions

import retrofit2.Response
import retrofit2.http.GET

interface PositionsApi {
    /**
     * Get a list of user positions
     */
    @GET("positions")
    suspend fun getPositions() : Response<PositionsResponse>
}