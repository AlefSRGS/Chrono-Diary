package com.example.chrono_diary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chrono_diary.screens.HomeScreen
import com.example.chrono_diary.screens.*
import com.example.chrono_diary.UserViewModel

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    userViewModel: UserViewModel
) {
    NavHost(navController, startDestination = "SplashScreen") {

        composable("SplashScreen"){
            SplashScreen(navController = navController)
        }
        composable("AuthScreen") {
            AuthScreen(
                userViewModel = userViewModel,
                onNavigateToCad = { navController.navigate("CadScreen") },
                navController = navController
            )
        }
        composable("CadScreen") {
            CadScreen(
                userViewModel = userViewModel,
                onNavigateToLogin = { navController.navigate("AuthScreen") }
            )
        }
        composable("HomeScreen/{username}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username") ?: ""
            HomeScreen(
                username = username,
                userViewModel = userViewModel,
                navController = navController
            )
        }
    }
}


