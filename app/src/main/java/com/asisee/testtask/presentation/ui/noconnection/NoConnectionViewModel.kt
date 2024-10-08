package com.asisee.testtask.presentation.ui.noconnection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asisee.testtask.domain.service.connection.NetworkConnectivityService
import com.asisee.testtask.domain.service.connection.NetworkStatus
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class NoConnectionViewModel(
    private val networkConnectivityService: NetworkConnectivityService
) : ViewModel() {
    suspend fun isConnected() : Boolean = networkConnectivityService.currentStatus() == NetworkStatus.Connected

    fun tryAgain(close: () -> Unit) = viewModelScope.launch {
        if (isConnected())
            close()
    }
}