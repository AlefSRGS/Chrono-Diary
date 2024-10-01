package com.example.chrono_diary.screens



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.example.chrono_diary.R
import com.example.chrono_diary.models.UserTask

@Composable
fun TaskCard(userTask: UserTask){

    Card(
        modifier = Modifier.padding(12.dp),
        content = {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = userTask.taskName, fontSize = 22.sp , fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        shape = RoundedCornerShape(8.dp),

                        modifier = Modifier
                            .padding(0.5.dp)
                            .width(40.dp)
                            .height(33.dp)
                            .background(Color.White)


                    ){

                        Icon(painter = painterResource(id = R.drawable.check) , contentDescription = null , modifier = Modifier.size(24.dp) , tint = Color.White )
                    }


                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .padding(0.5.dp)
                            .width(40.dp)
                            .height(33.dp)


                    ){

                        Icon(painter = painterResource(id = R.drawable.close) , contentDescription = null , modifier = Modifier.size(24.dp) , tint = Color.White )

                    }


                }

                Spacer(modifier = Modifier.height(18.dp))

                Row{
                    Text(text ="Fim : "+ userTask.dueDate , fontSize = 16.sp )

                    Spacer(modifier = Modifier.width(120.dp))
                    Icon(painter = painterResource(id = R.drawable.flag) , contentDescription = null, modifier = Modifier.size(22.dp).padding(0.5.dp))
                    Text(text = userTask.tag , fontSize = 16.sp )
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