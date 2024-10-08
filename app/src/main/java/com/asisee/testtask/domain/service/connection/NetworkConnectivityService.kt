package com.asisee.testtask.domain.service.connection

import kotlinx.coroutines.flow.Flow

interface NetworkConnectivityService {
    suspend fun currentStatus(): NetworkStatus

    val networkStatus: Flow<NetworkStatus>
}