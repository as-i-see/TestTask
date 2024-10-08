package com.asisee.testtask.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.asisee.testtask.domain.service.connection.NetworkConnectivityService
import com.asisee.testtask.domain.service.connection.NetworkStatus
import com.asisee.testtask.presentation.common.NavigationBarItem
import com.asisee.testtask.presentation.theme.Black60
import com.asisee.testtask.presentation.theme.Secondary
import com.asisee.testtask.presentation.theme.TestTaskTheme
import com.asisee.testtask.presentation.theme.WhiteSmoke
import org.koin.androidx.compose.KoinAndroidContext
import org.koin.compose.koinInject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
        setContent {
            val navController = rememberNavController()
            KoinAndroidContext {
                val connectionService = koinInject<NetworkConnectivityService>()
                LaunchedEffect(true) { // observe connectivity changes
                    connectionService.networkStatus.collect {
                        if (it == NetworkStatus.Disconnected) {
                            navController.navigate(NOCONNECTION_SCREEN)
                        }
                    }
                }
                LaunchedEffect(true) { // check current connectivity
                    val networkStatus = connectionService.currentStatus()
                    if (networkStatus == NetworkStatus.Disconnected)
                        navController.navigate(NOCONNECTION_SCREEN)
                }
                TestTaskTheme {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentRoute = navBackStackEntry?.destination?.route

                    // Hide or show status bar
                    if (currentRoute?.startsWith(SIGNUPRESULT_SCREEN) == true || currentRoute?.startsWith(NOCONNECTION_SCREEN) == true) {
                        insetsController.apply {
                            hide(WindowInsetsCompat.Type.statusBars())
                            hide(WindowInsetsCompat.Type.navigationBars())
                            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                        }
                    } else {
                        insetsController.apply {
                            show(WindowInsetsCompat.Type.statusBars())
                            show(WindowInsetsCompat.Type.navigationBars())
                        }
                    }

                    Scaffold(
                        bottomBar = {
                            if (currentRoute in bottomBarRoutes) {
                                NavigationBar(
                                    modifier = Modifier.height(56.dp),
                                    containerColor = WhiteSmoke,
                                ) {
                                    bottomNavigationItems.forEach { item ->
                                        NavigationBarItem(
                                            modifier = Modifier.weight(1f, true),
                                            onClick = {
                                                navController.navigate(item.route) {
                                                    popUpTo(navController.graph.findStartDestination().id) {
                                                        saveState = true
                                                    }
                                                    launchSingleTop = true
                                                    restoreState = true
                                                }
                                            },
                                            icon = {
                                                Image(
                                                    modifier = Modifier.size(24.dp),
                                                    painter = rememberVectorPainter(item.icon),
                                                    contentDescription = null,
                                                    colorFilter = if (currentRoute == item.route) ColorFilter.tint(Secondary, BlendMode.SrcIn) else null
                                                )
                                            },
                                            label = {
                                                Text(
                                                    text = item.label,
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontWeight = FontWeight.SemiBold,
                                                    color = if (currentRoute == item.route) Secondary else Black60
                                                )
                                            },
                                        )
                                    }
                                }
                            }
                        }
                    ) { innerPadding ->
                        Column(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            AppNavigation(navController, Modifier.padding(innerPadding))
                        }
                    }
                }
            }
        }
    }
}

const val USERS_SCREEN = "users"
const val SIGNUP_SCREEN = "signup"
const val SIGNUPRESULT_SCREEN = "signupresult"
const val SIGNUPRESULT_ARG = "result"
const val NOCONNECTION_SCREEN = "noconnection"