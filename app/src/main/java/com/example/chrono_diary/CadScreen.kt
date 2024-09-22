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
import androidx.compose.ui.unit.dp
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cadScreen(onSignInClick: (String) -> Unit, onSignUpClick: () -> Unit) {
    var completename by remember { mutableStateOf("") }
    var username by remember{ mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }


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

        //data de nascimento
        val context = LocalContext.current
        var selectedDate = remember { mutableStateOf("") }
        val calendar = Calendar.getInstance()

        // DatePickerDialog
        val datePickerDialog = DatePickerDialog(
            context,
            R.style.CustomDatePickerDialog,
            { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                selectedDate.value = "$dayOfMonth/${month + 1}/$year"
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )



            OutlinedTextField(
                value = selectedDate.value,
                onValueChange = { },
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

        Spacer(modifier = Modifier.height(8.dp))
    }
}