package com.example.chrono_diary

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.ButtonDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun authScreen(onSignInClick: (String) -> Unit, onSignUpClick: () -> Unit, navController: NavController) {
            var username by remember{ mutableStateOf("") }
            var password by remember{ mutableStateOf("") }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.logo_chrono4),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .padding(bottom = 32.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(2.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFF6899EB),
                        shape = RoundedCornerShape(8.dp),
                    ),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)

            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    OutlinedTextField(
                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Nome de Usuário") },
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

                    Spacer(modifier = Modifier.height(8.dp))
                      var password_visibility by remember{ mutableStateOf(false) }

                      val icon = if(password_visibility){
                          painterResource(id = R.drawable.visibility_on)
                      }else{
                          painterResource(id = R.drawable.visibility_off)
                      }
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Senha") },
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

                        ),
                        trailingIcon = {
                            IconButton(onClick = {
                                password_visibility = !password_visibility
                            }){
                                Icon(
                                    painter = icon ,
                                    contentDescription = "Visibility Icon"
                                )
                            }
                        },
                        visualTransformation = if (password_visibility) VisualTransformation.None
                        else PasswordVisualTransformation()

                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = painterResource(R.drawable.text_link),
                        contentDescription = "Esqueceu a Senha",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4B7195)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.padding(16.dp).width(200.dp)
            ){
                Text("Entrar",color = Color.White)
            }
            Spacer(modifier = Modifier.height(32.dp))
            Image(
                painter = painterResource(R.drawable.n_o_tem_uma_conta_inscreva_se_no_chronodiary_),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .clickable {
                        navController.navigate("cadScreen")
                    }
            )
        }
}

