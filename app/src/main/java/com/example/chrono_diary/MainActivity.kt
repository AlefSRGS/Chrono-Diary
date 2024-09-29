package com.example.chrono_diary

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController,"AuthScreen"){
                        composable("AuthScreen") {
                            authScreen(
                                onSignInClick = { user ->
                                    navController.navigate("UserScreen/${user}")
                                },
                                onSignUpClick = {
                                    navController.navigate("SignUpScreen")
                                },
                                navController = navController
                            )
                        }
                        composable("CadScreen") {
                            cadScreen(
                                onSignInClick = { },
                                onSignUpClick = { }
                            )
                        }
                    }
                }
            }
        }
    }
}

