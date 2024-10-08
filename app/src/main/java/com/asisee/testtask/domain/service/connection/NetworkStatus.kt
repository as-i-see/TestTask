package com.asisee.testtask.domain.service.connection

sealed interface NetworkStatus {
    data object Connected: NetworkStatus
    data object Disconnected: NetworkStatus
}