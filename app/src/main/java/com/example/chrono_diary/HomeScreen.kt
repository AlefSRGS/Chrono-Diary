package com.example.chrono_diary

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onSignInClick: (String) -> Unit, onSignUpClick: () -> Unit, navController: NavController) {
     var task_name by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF6899EB)
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.conta_icon),
                    contentDescription = "Icone de conta",
                    modifier = Modifier
                        .size(65.dp)
                        .padding(end = 2.dp)
                )
                Text(
                    text = "Ola , nome do usuario",
                    color = Color.White,
                    fontSize = 23.sp,
                )
            }
       Column(
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Top,
           modifier = Modifier
               .fillMaxHeight()
               .fillMaxWidth()
               .padding(top = 10.dp)
               .clip(RoundedCornerShape(16.dp))
               .background(Color.White)
               .border(2.dp, Color.White, RoundedCornerShape(16.dp))

       ) {

           Row{

               OutlinedTextField(
                   value = task_name,
                   onValueChange = { task_name = it },
                   label = { Text("Nome Completo") },
                   modifier = Modifier
                       .width(320.dp)
                       .padding(4.dp)
                       .height(65.dp),
                   shape = RoundedCornerShape(8.dp),
                   colors = TextFieldDefaults.outlinedTextFieldColors(
                       containerColor = Color.White,
                       unfocusedBorderColor = Color(0xFF6899EB),
                       focusedBorderColor = Color(0xFF6899EB),
                       unfocusedLabelColor = Color(0xFF4B7195),
                       focusedLabelColor = Color(0xFF6899EB)
                   )
               )

           }





           LazyRow(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(12.dp),
               verticalAlignment = Alignment.CenterVertically

           ){
               item{

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                   ){
                       Text(text = "Todos " , color = Color(0xFF4B7195), fontSize =  14.sp)
                   }

                   Spacer(modifier = Modifier.width(8.dp))

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                       ){
                       Text(text = "Trabalho" , color = Color(0xFF4B7195), fontSize = 10.6.sp)
                   }

                   Spacer(modifier = Modifier.width(8.dp))

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                       ){
                       Text(text = "Pessoal" , color = Color(0xFF4B7195), fontSize = 10.5.sp)
                   }

                   Spacer(modifier = Modifier.width(8.dp))

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                       ){
                       Text(text = "Faculdade" , color = Color(0xFF4B7195), fontSize = 9.1.sp)
                   }

                   Spacer(modifier = Modifier.width(8.dp))

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                       ){
                       Text(text = "Saúde" , color = Color(0xFF4B7195))
                   }

                   Spacer(modifier = Modifier.width(8.dp))

                   Button(
                       onClick = { },
                       colors = ButtonDefaults.buttonColors( Color(0xFF6899EB)),
                       shape = RoundedCornerShape(8.dp),
                       modifier = Modifier
                           .padding(2.5.dp)
                           .width(90.dp)
                           .height(32.dp)
                           .border(
                               width = 1.dp,
                               color = Color(0xFF4B7195),
                               shape = RoundedCornerShape(8.dp)
                           )
                           .padding(0.dp),

                       ){
                       Text(text = "Qualquer" , color = Color(0xFF4B7195) , fontSize = 10.5.sp)
                   }
               }




          }
           
         }

      }
    }}


