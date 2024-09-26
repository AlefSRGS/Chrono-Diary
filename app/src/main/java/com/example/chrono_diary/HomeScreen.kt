package com.example.chrono_diary

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(onSignInClick: (String) -> Unit, onSignUpClick: () -> Unit, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF6899EB)
    ) {

       Column(
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Top,
           modifier = Modifier
               .fillMaxHeight()
               .fillMaxWidth()
               .padding(top = 120.dp)
               .clip(RoundedCornerShape(16.dp))
               .background(Color.White)
               .border(2.dp, Color.White, RoundedCornerShape(16.dp))

       ) {
           
          Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(16.dp),
              verticalAlignment = Alignment.CenterVertically

          ){
              Button(onClick = { },
                     modifier = Modifier.background(Color.Blue)
                     
                      ) {
                         Text(text = "eae")
                        }
              
          } 
           
         }

      }
    }


