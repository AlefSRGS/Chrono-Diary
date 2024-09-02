package com.example.loginapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.VpnKey
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapp.User
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun AuthScreen(
        onSignInClick: (User) -> Unit,
        onSignUpClick: () -> Unit
    ) {
    Column {
        var userName by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        Text(
            text = "Login",
            Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 10.dp
                )
                .align(Alignment.CenterHorizontally)
        )
        TextField(
            value = userName,
            onValueChange = { newValue ->
                userName = newValue
            },
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "username")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Icon for login"
                )
            }
        )
        TextField(
            value = password,
            onValueChange = { newValue ->
                password = newValue
            },
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "password")
            },
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.VpnKey,
                    contentDescription = "Icon for password"
                )
            },
        )
        Button(
            onClick = {
                onSignInClick(
                    User(
                        userName,
                        password
                    )
                )
            },
            Modifier
                .padding(
                    horizontal = 140.dp,
                    vertical = 5.dp
                )
                .fillMaxWidth()
        ) {
            Text(text = "Sign in")
        }
        Button(
            onClick = {
                onSignUpClick()
            },
            Modifier
                .padding(
                    horizontal = 140.dp,
                    vertical = 5.dp
                )
                .fillMaxWidth()
        ) {
            Text(text = "Sign up")
        }
    }
}

@Preview
@Composable
fun AuthScreenPreview() {
    LoginAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AuthScreen(
                onSignInClick = {},
                onSignUpClick = {}
            )
        }
    }
}