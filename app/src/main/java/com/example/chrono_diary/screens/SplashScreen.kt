package com.example.chrono_diary.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.chrono_diary.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var isFirstImageVisible by remember { mutableStateOf(true) }

    // Transição de fade
    val transition = rememberInfiniteTransition()
    val alpha by transition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000),
            repeatMode = RepeatMode.Reverse
        )
    )

    LaunchedEffect(Unit) {
        delay(400)
        isFirstImageVisible = false // Troca para a segunda imagem
        delay(1500)

        navController.navigate("AuthScreen") {
            popUpTo("SplashScreen") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        if (isFirstImageVisible) {
            Image(
                painter = painterResource(id = R.drawable.slapscreen1),
                contentDescription = null,
                modifier = Modifier
                    .size(300.dp)
                    .graphicsLayer(alpha = alpha)
            )
        } else {
            Image(
                painter = painterResource(id = R.drawable.slapscreen2),
                contentDescription = null,
                modifier = Modifier
                    .size(300.dp)
                    .graphicsLayer(alpha = alpha)
            )
        }
    }
}