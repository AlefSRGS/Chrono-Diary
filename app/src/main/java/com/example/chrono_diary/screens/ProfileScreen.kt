package com.example.profilescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chrono_diary.R
import com.example.loginapp.ui.theme.ProfileScreenTheme

// Classe User
data class User(val username: String, val password: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cria uma instância do usuário
        val user = User(username = "Usuário Exemplo", password = "Senha Exemplo")

        setContent {
            ProfileScreenTheme {
                LoginScreen(user = user)
            }
        }
    }
}

@Composable
fun LoginScreen(user: User) {
    // Tela com fundo azul claro
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6899EB))
    ) {
        // Parte superior azul com a imagem centralizada
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)  // Parte azul ocupa 40% da altura
                .align(Alignment.TopCenter),
            contentAlignment = Alignment.Center // Centraliza o conteúdo (imagem)
        ) {
            // Imagem do perfil ou outra
            Image(
                painter = painterResource(id = R.drawable.icon), // Substitua pelo nome da imagem no drawable
                contentDescription = "Imagem do Usuário",
                modifier = Modifier
                    .size(120.dp)  // Tamanho da imagem
                    .padding(16.dp)
                    .offset(x = 0.dp, y = (-60).dp),
                contentScale = ContentScale.Crop // Para ajustar o conteúdo
            )
        }

        // Bloco branco
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f)  // O bloco branco ocupa 60% da tela
                .background(Color.White, shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .align(Alignment.BottomCenter)
                .padding(16.dp),  // Padding interno
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Nome do usuário vindo da classe User
            Text(
                text = "Bem-vindo, ${user.username}",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black,
                modifier = Modifier.padding(top = 16.dp)
            )
            // Exibição de algumas informações do usuário
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = user.username, // Nome do usuário no primeiro bloco
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(80.dp))

            // Coluna com os blocos um embaixo do outro
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally // Centraliza os blocos horizontalmente
            ) {
                // Primeiro bloco (nome do usuário)
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)  // Largura ajustada
                        .height(100.dp)  // Altura do bloco
                        .border(2.dp, Color(0xFF6899EB), shape = RectangleShape) // Borda azul
                        .padding(16.dp) // Padding dentro do bloco
                ) {
                    Text(text = "Tasks Concluídas", color = Color.Gray)
                }
                Spacer(modifier = Modifier.height(80.dp)) // Espaço entre os dois blocos

                // Segundo bloco
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)  // Largura ajustada
                        .height(100.dp)
                        .border(2.dp, Color(0xFF6899EB), shape = RectangleShape)
                        .padding(16.dp)
                ) {
                    Text(text = "Tasks Restantes", color = Color.Gray)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewLoginScreen() {
    // User para a visualização
    val user = User(username = "Usuário Exemplo", password = "Senha Exemplo")

    ProfileScreenTheme {
        LoginScreen(user = user)
    }
}
