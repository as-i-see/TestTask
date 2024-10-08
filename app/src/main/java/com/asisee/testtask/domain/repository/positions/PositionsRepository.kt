package com.asisee.testtask.domain.repository.positions

import com.asisee.testtask.data.remote.positions.Position

interface PositionsRepository {
    suspend fun getPositions() : List<Position>?
}