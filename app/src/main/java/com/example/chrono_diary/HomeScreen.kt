package com.example.chrono_diary

import android.app.TimePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.FloatingActionButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.window.DialogProperties
import androidx.compose.material3.*
import androidx.compose.ui.platform.LocalContext
import java.util.Calendar
import android.app.DatePickerDialog
import android.widget.TimePicker



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onSignInClick: (String) -> Unit, onSignUpClick: () -> Unit, navController: NavController) {

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
                    .padding(top = 17.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .border(2.dp, Color.White, RoundedCornerShape(16.dp))

            ) {

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 17.dp, start = 3.dp, end = 3.dp),
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
                            Text(text = "SaÃºde" , color = Color(0xFF4B7195))
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            val openAlertDialog = remember{ mutableStateOf(false) }

            FloatingActionButton(modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd),
                containerColor = Color(0xFF6899EB),
                onClick = {openAlertDialog.value = true }
            ) {

                Image(painter = painterResource(id = R.drawable.plus_icon) , contentDescription = null )

            }

            if(openAlertDialog.value){

                AlertDialog(
                    onDismissRequest = { openAlertDialog.value = false },
                    confirmButton = {
                        Button(onClick = { openAlertDialog.value = false }, modifier = Modifier.background(Color(0xFF4B7195))) {
                            Text("Criar")
                        }
                    },
                    dismissButton = {
                        Button(onClick = { openAlertDialog.value = false } , modifier = Modifier.background(Color(0xFF4B7195))) {
                            Text("Cancelar")
                        }
                    },
                    title = {
                        Text(text = "Nova Task")
                    },
                    text = {

                        Column{
                            var task_name by remember { mutableStateOf("") }

                            TextField(

                                value = task_name,
                                onValueChange = { task_name = it },
                                label  = {
                                    Text(
                                        text = "Titulo"
                                    )
                                },
                                modifier = Modifier
                                    .width(320.dp)
                                    .padding(4.dp)
                                    .height(65.dp),

                                )

                            Spacer(modifier = Modifier.height(8.dp))

                            Row{

                                Icon(painter = painterResource(id = R.drawable.relogio), contentDescription = null )
                                Spacer(modifier = Modifier.width(8.dp))

                                Text(text = "Todo dia " , modifier=Modifier.padding(16.dp) , fontSize = 25.sp)
                                var isChecked by remember { mutableStateOf(true) }


                                Spacer(modifier = Modifier.width(8.dp))
                                Switch(
                                    checked = isChecked,
                                    onCheckedChange = {isChecked = it },

                                    )

                            }

                            Spacer(modifier = Modifier.width(16.dp))

                            Row{

                                //data de nascimento
                                val context = LocalContext.current
                                var selectedDate = remember { mutableStateOf("") }
                                val calendar = Calendar.getInstance()

                                val initialYear = calendar.get(Calendar.YEAR)
                                val initialMonth = calendar.get(Calendar.MONTH)
                                val initialDay = calendar.get(Calendar.DAY_OF_MONTH)
                                val initialHour = calendar.get(Calendar.HOUR_OF_DAY)
                                val initialMinute = calendar.get(Calendar.MINUTE)

                                // DatePickerDialog
                                val datePickerDialog = DatePickerDialog(
                                    context,
                                    R.style.CustomDatePickerDialog,
                                    { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->


                                        val timePickerDialog = TimePickerDialog(
                                            context,
                                            { _: TimePicker, hourOfDay: Int, minute: Int ->

                                                var selectedDateTime =
                                                    "$dayOfMonth/${month + 1}/$year $hourOfDay:$minute"
                                            },
                                            initialHour, initialMinute, true
                                        )

                                        timePickerDialog.show()

                                    },
                                    initialYear, initialMonth, initialDay
                                )



                                OutlinedTextField(
                                    value = selectedDate.value,
                                    onValueChange = { },
                                    label = { Text("Data de Nascimento") },
                                    readOnly = true,
                                    modifier = Modifier
                                        .clickable { datePickerDialog.show() }
                                        .width(110.dp)
                                        .padding(4.dp)
                                        .height(15.dp),
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

                                Spacer(modifier = Modifier.width(8.dp))

                                Icon(painter = painterResource(id = R.drawable.flecha), contentDescription = null)

                                Spacer(modifier = Modifier.width(8.dp))

                                //data de nascimento
                                val context_two = LocalContext.current
                                var selectedDate_two = remember { mutableStateOf("") }
                                val calendar_two = Calendar.getInstance()

                                // DatePickerDialog
                                val initialYear_two = calendar_two.get(Calendar.YEAR)
                                val initialMonth_two = calendar_two.get(Calendar.MONTH)
                                val initialDay_two = calendar_two.get(Calendar.DAY_OF_MONTH)
                                val initialHour_two = calendar_two.get(Calendar.HOUR_OF_DAY)
                                val initialMinute_two = calendar_two.get(Calendar.MINUTE)

                                // DatePickerDialog
                                val datePickerDialog_two = DatePickerDialog(
                                    context_two,
                                    R.style.CustomDatePickerDialog,
                                    { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->


                                        val timePickerDialog = TimePickerDialog(
                                            context,
                                            { _: TimePicker, hourOfDay: Int, minute: Int ->

                                                var selectedDateTime_two =
                                                    "$dayOfMonth/${month + 1}/$year $hourOfDay:$minute"
                                            },
                                            initialHour_two, initialMinute_two, true
                                        )

                                        timePickerDialog.show()

                                    },
                                    initialYear_two, initialMonth_two, initialDay_two
                                )



                                OutlinedTextField(
                                    value = selectedDate_two.value,
                                    onValueChange = { },
                                    label = { Text("Data de Nascimento") },
                                    readOnly = true,
                                    modifier = Modifier
                                        .clickable { datePickerDialog_two.show() }
                                        .width(110.dp)
                                        .padding(4.dp)
                                        .height(15.dp),
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




                            }




                        }

                    },

                    properties = DialogProperties(dismissOnClickOutside = true) // Opcional, fecha ao clicar fora
                )
            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(
        onSignInClick = { },
        onSignUpClick = {  },
        navController = navController
    )
}

