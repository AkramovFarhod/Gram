package com.example.gramtaxi


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegisTwo (navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(), verticalArrangement = Arrangement.spacedBy(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier.padding(50.dp), text = "Регистрация", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Column(modifier = Modifier) {
            Text(text = "Зарабатывайте с нами ", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=20.sp, textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
            Text(text = "уже сегодня ", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=20.sp, textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
        }

///////////
        val options = listOf("Худжанд", "Option 2", "Option 3", "Option 4", "Option 5")
        var expanded by remember { mutableStateOf(false) }
        var selectedOptionText by remember { mutableStateOf(options[0]) }

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionText,
                onValueChange = { },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expanded
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {
                options.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionText = selectionOption
                            expanded = false
                        }
                    ) {
                        Text(text = selectionOption)
                    }
                }
            }
        }


          //  Spacer(modifier = Modifier.padding(3.dp))
/////////


            var name by remember { mutableStateOf("") }
            TextField(
                value = name,
                onValueChange = { newText ->
                    name = newText

                },
                modifier = Modifier,
                label = {
                    Text(text = "+992-__-___-____")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
        }

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Button(modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .height(60.dp),

                onClick = {
                   navController.navigate(Screen.RegisThree.route)
                },

                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black, contentColor = Color.White),
                elevation =  ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 10.dp,
                    disabledElevation = 10.dp
                )) {
                Text( text = "Далее", fontSize = 18.sp)
            }

        }

    }


