package com.example.chrono_diary


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card

import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskCard(){

    Card(
        modifier = Modifier.padding(16.dp),
        content = {

            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(35.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Task")
                }
            }

        },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )

    )




}

@Preview(showBackground = true)
@Composable
fun TaskCardPreview(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TaskCard()
    }


}