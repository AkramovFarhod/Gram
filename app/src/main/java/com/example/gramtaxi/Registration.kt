package com.example.gramtaxi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Registration(navController: NavController){
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
        Row(modifier = Modifier
//            .offset(x = 37.dp, y = 1.dp)

            .fillMaxWidth()
            .padding(start = 37.dp, end = 37.dp), horizontalArrangement = Arrangement.Center

        ) {
            val options = listOf("+992", "Option 2", "Option 3", "Option 4", "Option 5")
            var expanded by remember { mutableStateOf(false) }
            var selectedOptionText by remember { mutableStateOf(options[0]) }

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {
                    expanded = !expanded
                }
            ) {
                TextField(modifier = Modifier
                    .height(56.dp)
                    .width(140.dp),
                    readOnly = true,
                    value = selectedOptionText,
                    onValueChange = { },

                   leadingIcon = {
                        Image(painterResource(id = R.drawable.gram), contentDescription = null, modifier = Modifier.width(35.dp).height(30.dp))
                    },
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
Spacer(modifier = Modifier.padding(3.dp))
/////////
            var name by remember { mutableStateOf("") }
            TextField(
                value = name,
                onValueChange = { newText ->
                    name = newText

                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Телфон")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                )
           // Text(text = "Для получение пороля нажмите <<Далее>> ")
        }

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
           Text(modifier=Modifier.fillMaxWidth(),text = "Для получение пороля нажмите <<Далее>> ", textAlign = TextAlign.Center)
            Button(modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .height(60.dp),

                onClick = {
                   navController.navigate(Screen.RegisOne.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black, contentColor = Color.White),
                elevation =  ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 10.dp,
                    disabledElevation = 10.dp
                )) {
                Text(text = "Далее", fontSize = 18.sp)
        }

        }

    }

}