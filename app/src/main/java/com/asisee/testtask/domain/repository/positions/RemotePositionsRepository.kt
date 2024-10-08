package com.asisee.testtask.domain.repository.positions

import com.asisee.testtask.data.remote.positions.Position
import com.asisee.testtask.data.remote.positions.PositionsApi
import org.koin.core.annotation.Single

@Single
class RemotePositionsRepository(
    private val positionsApi: PositionsApi
) : PositionsRepository {
    override suspend fun getPositions(): List<Position>? {
        return try {
            val response = positionsApi.getPositions()
            response.body()?.positions
        } catch (e: Exception) {
            null
        }
    }
}