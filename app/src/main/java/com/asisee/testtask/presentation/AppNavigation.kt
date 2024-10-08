package com.asisee.testtask.presentation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.asisee.testtask.presentation.res.People
import com.asisee.testtask.presentation.res.PersonAdd
import com.asisee.testtask.presentation.ui.noconnection.NoConnectionScreen
import com.asisee.testtask.presentation.ui.signup.SignUpScreen
import com.asisee.testtask.presentation.ui.signupresult.SignUpResultScreen
import com.asisee.testtask.presentation.ui.users.UsersScreen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    NavHost(navController = navController, startDestination = USERS_SCREEN) {
        composable(USERS_SCREEN) { UsersScreen() }
        composable(SIGNUP_SCREEN) {
            BackHandler(true) {}
            SignUpScreen(
                toSignUpResult = { status ->
                    coroutineScope.launch(Dispatchers.Main.immediate) {
                        navController.navigate("$SIGNUPRESULT_SCREEN/$status")
                    }
                },
            )
        }
        composable(NOCONNECTION_SCREEN) {
            BackHandler(true) {}
            NoConnectionScreen(
                pop = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = "$SIGNUPRESULT_SCREEN/{$SIGNUPRESULT_ARG}",
            arguments = listOf(
                navArgument(SIGNUPRESULT_ARG) {
                    type = NavType.IntType
                    nullable = false
                }
            )
        ) { entry ->
            val status = entry.arguments!!.getInt(SIGNUPRESULT_ARG)
            SignUpResultScreen(
                status = status,
                close = {
                    navController.popBackStack()
                },
            )
        }
    }
}

val bottomNavigationItems = listOf(
    NavigationItem(USERS_SCREEN, "Users", People),
    NavigationItem(SIGNUP_SCREEN, "Sign Up", PersonAdd),
)

val bottomBarRoutes = bottomNavigationItems.map { it.route }

data class NavigationItem(val route: String, val label: String, val icon: ImageVector)