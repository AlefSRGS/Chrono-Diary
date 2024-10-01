package com.example.chrono_diary.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import java.util.*
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.chrono_diary.R
import com.example.chrono_diary.UserViewModel
import com.example.chrono_diary.models.User

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadScreen(userViewModel: UserViewModel, onNavigateToLogin: () -> Unit) {
    var completename by remember { mutableStateOf("") }
    var username by remember{ mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    var selectedDate by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.logo_chrono4),
            contentDescription = "App Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .padding(bottom = 32.dp)
        )


        OutlinedTextField(
            value = completename,
            onValueChange = { completename = it },
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
        Spacer(modifier = Modifier.height(8.dp))


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


        val context = LocalContext.current
        val calendar = Calendar.getInstance()

        val datePickerDialog = remember {
            DatePickerDialog(
                context,
                R.style.CustomDatePickerDialog,
                { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                    selectedDate = "$dayOfMonth/${month + 1}/$year"
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
        }



        OutlinedTextField(
            value = selectedDate,
            onValueChange = {},
            label = { Text("Data de Nascimento") },
            readOnly = true,
            modifier = Modifier
                .clickable { datePickerDialog.show() }
                .width(320.dp)
                .padding(4.dp)
                .height(65.dp),
            placeholder = { Text(text = "Selecione uma data") },
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

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-Mail") },
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

        var confirm_password_visibility by remember{ mutableStateOf(false) }

        val confirm_icon = if(confirm_password_visibility){
            painterResource(id = R.drawable.visibility_on)
        }else{
            painterResource(id = R.drawable.visibility_off)
        }

        OutlinedTextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            label = { Text("Confirmar Senha") },
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
                    confirm_password_visibility = !confirm_password_visibility
                }){
                    Icon(
                        painter = confirm_icon ,
                        contentDescription = "Visibility Icon"
                    )
                }
            },
            visualTransformation = if (confirm_password_visibility) VisualTransformation.None
            else PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.height(16.dp))

        fun checkInputUser(): Boolean{
            if(completename == "" || username == "" || email == "" || password == "" || selectedDate == ""){
                //pop-up preencha todos os campos
                return false
            }
            if(password != confirmpassword){
                //pop-up senhas nao correspondem
                return false
            }
            return true
        }
        Button(
            onClick = {
                if(checkInputUser()){
                    val newUser = User(
                        completeName = completename,
                        username = username,
                        email = email,
                        password = password,
                        birthDate = selectedDate
                    )
                    userViewModel.addUser(newUser)

                    completename = ""
                    username = ""
                    email = ""
                    password = ""
                    confirmpassword = ""
                    selectedDate = ""

                    //pop-up de cadastro concluido

                    onNavigateToLogin()
                }
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4B7195)),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(16.dp).width(200.dp)
        ) {
            Text("Cadastrar", color = Color.White)
        }
    }
}