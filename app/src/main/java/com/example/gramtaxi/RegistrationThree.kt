package com.example.gramtaxi


import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegisThee(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(), verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier.padding(2.dp),
            text = "Регистрация",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Image(painter = painterResource(id = R.drawable.book),
            contentDescription = "",
            modifier = Modifier
                .width(170.dp)
                .height(60.dp))
        Text(text = "Личная информация")

        var name by remember { mutableStateOf("") }
        TextField(
            value = name,
            onValueChange = { newText ->
                name = newText
            },
            label = {
                Text(text = "Фамилия")
            }
        )

        var sunem by remember { mutableStateOf("") }
        TextField(
            value = sunem,
            onValueChange = { newText ->
                sunem = newText
            },
            label = {
                Text(text = "Имя")
            }
        )

        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text = "Отчество")
            }
        )

        val options = listOf( "Мужчино", "Женщина", )
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
                label = {
                    Text(text = "Пол" )
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
        var data by remember { mutableStateOf("") }
        TextField(
            value = data,
            onValueChange = { newText ->
                data = newText
            },
            label = {
                Text(text = "Дата рождения")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )
        var emal by remember { mutableStateOf("") }
        TextField(
            value = emal,
            onValueChange = { newText ->
                emal = newText
            },
            label = {
                Text(text = "Email")
            }
        )

        var promakod by remember { mutableStateOf("") }
        TextField(
            value = promakod,
            onValueChange = { newText ->
                promakod = newText
            },
            label = {
                Text(text = "Промокод")
            }
        )


        Row() {
            Button(modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .width(140.dp),
                onClick = {
                    navController.navigate(Screen.RegisTwo.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White,
                    contentColor = Color.Black),
                border = BorderStroke(3.dp, Color.Black)
            ) {
                Text(
                    text = "Назад",
                    color = Color.Black)
            }
            Spacer(modifier = Modifier.padding(1.dp))
            ///////////////////////////////////////
            Button(modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .width(140.dp),
                onClick = {
                    navController.navigate(Screen.RegisFour.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
                    contentColor = Color.White)
            ) {
                Text(
                    text = "Далее",
                    color = Color.White)
            }
        }
    }
}

 