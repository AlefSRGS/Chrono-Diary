package com.example.chrono_diary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.chrono_diary.models.User
import com.example.chrono_diary.models.UserTask
import com.example.chrono_diary.navigation.SetupNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val userViewModel: UserViewModel = viewModel()
            var userForTest =
                User(
                    "SuperManIsIdiot",
                    "Lex Luthor",
                    "ihatesuperman",
                    "lexluthor@lexcorp.com",
                    "28/09/1940"
                )
            var taskForTest =
                UserTask(
                    "Matar Superman",
                    "28/09/2025",
                    "",
                    false
                )

            userViewModel.addTaskToUser(userForTest,taskForTest)
            userViewModel.addUser(userForTest)

            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetupNavGraph(navController = navController, userViewModel = userViewModel)
                }
            }
        }
    }
}
