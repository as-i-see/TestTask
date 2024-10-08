package com.asisee.testtask.domain.service.connection

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import org.koin.core.annotation.Single
import java.net.InetAddress
import java.net.UnknownHostException

@Single
class NetworkConnectivityServiceImpl(
    context: Context
) : NetworkConnectivityService {

    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    override val networkStatus: Flow<NetworkStatus> = callbackFlow {
        val connectivityCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                trySend(NetworkStatus.Connected)
            }
            override fun onUnavailable() {
                trySend(NetworkStatus.Disconnected)
            }
            override fun onLost(network: Network) {
                trySend(NetworkStatus.Disconnected)
            }
        }
        val request = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
            .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
            .build()
        connectivityManager.registerNetworkCallback(request, connectivityCallback)
        awaitClose {
            connectivityManager.unregisterNetworkCallback(connectivityCallback)
        }
    }
    .flowOn(Dispatchers.IO)

    override suspend fun currentStatus(): NetworkStatus = withContext(Dispatchers.IO) {
        return@withContext try {
            val address = InetAddress.getByName("www.google.com")
            if (address.equals("")) {
                NetworkStatus.Disconnected
            } else NetworkStatus.Connected
        } catch (e: UnknownHostException) {
            NetworkStatus.Disconnected
        }
    }
}