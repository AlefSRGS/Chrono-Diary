package com.example.chrono_diary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chrono_diary.screens.cadScreen
import com.example.chrono_diary.screens.*
import com.example.chrono_diary.UserViewModel

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    userViewModel: UserViewModel
) {
    NavHost(navController, startDestination = "AuthScreen") {
        composable("loginScreen") {
            authScreen(
                userViewModel = userViewModel,
                onNavigateToCad = { navController.navigate("CadScreen") }
            )
        }
        composable("CadScreen") {
            cadScreen(
                userViewModel = userViewModel,
                onNavigateToLogin = { navController.navigate("AuthScreen") }
            )
        }
        //navigate pra tela home
    }
}


