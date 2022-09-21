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
fun RegisSix (navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(), verticalArrangement = Arrangement.spacedBy(13.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier.padding(1.dp),
            text = "Регистрация",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Image(painter = painterResource(id = R.drawable.gramsix),
            contentDescription = "",
            modifier = Modifier
                .width(170.dp)
                .height(60.dp))
        Text(text = "Транспорт", fontSize = 15.sp, fontWeight = FontWeight.Bold)


        val optionsq = listOf("", "Option 2", "Option 3", "Option 4", "Option 5")
        var expandedq by remember { mutableStateOf(false) }
        var selectedOptionTextq by remember { mutableStateOf(optionsq[0]) }

        ExposedDropdownMenuBox(
            expanded = expandedq,
            onExpandedChange = {
                expandedq = !expandedq
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionTextq,
                onValueChange = { },
                label = {
                    Text(text = "Категория" )
                },


                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expandedq
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expandedq,
                onDismissRequest = {
                    expandedq = false
                }
            ) {
                optionsq.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionTextq = selectionOption
                            expandedq = false
                        }
                    ) {
                        Text(text = selectionOption)
                    }
                }
            }
        }


        val optionsw = listOf("", "Option 5", "Option 6", "Option 7", "Option 8")
        var expandedw by remember { mutableStateOf(false) }
        var selectedOptionTextw by remember { mutableStateOf(optionsw[0]) }

        ExposedDropdownMenuBox(
            expanded = expandedw,
            onExpandedChange = {
                expandedw = !expandedw
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionTextw,
                onValueChange = { },
                label = {
                    Text(text = "Марка" )
                },

                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expandedw
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expandedw,
                onDismissRequest = {
                    expandedw = false
                }
            ) {
                optionsw.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionTextw = selectionOption
                            expandedw = false
                        }
                    ) {
                        Text(text = selectionOption)
                    }
                }
            }
        }


        val optionse = listOf("","Option 9","Option 10","Option 11","Option 12")
        var expandede by remember { mutableStateOf(false) }
        var selectedOptionTexte by remember { mutableStateOf(optionse[0]) }

        ExposedDropdownMenuBox(
            expanded = expandede,
            onExpandedChange = {
                expandede = !expandede
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionTexte,
                onValueChange = { },
                label = {
                    Text(text = "Цвет" )
                },

                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expandede
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expandede,
                onDismissRequest = {
                    expandede = false
                }
            ) {
                optionse.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionTexte = selectionOption
                            expandede = false
                        }
                    ) {
                        Text(text = selectionOption)
                    }
                }
            }
        }


        val optionsr = listOf("", "Option 2", "Option 3", "Option 4", "Option 5")
        var expandedr by remember { mutableStateOf(false) }
        var selectedOptionTextr by remember { mutableStateOf(optionsr[0]) }

        ExposedDropdownMenuBox(
            expanded = expandedr,
            onExpandedChange = {
                expandedr = !expandedr
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionTextr,
                onValueChange = { },
                label = {
                    Text(text = "Год выпуска" )
                },


                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expandedr
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expandedr,
                onDismissRequest = {
                    expandedr = false
                }
            ) {
                optionsr.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionTextr = selectionOption
                            expandedr = false
                        }
                    ) {
                        Text(text = selectionOption)
                    }
                }
            }
        }


        var seri by remember { mutableStateOf("") }
        TextField(
            value = seri,
            onValueChange = { newText ->
                seri = newText
            },
            leadingIcon = {
                Image(painterResource(id = R.drawable.gram), contentDescription = null, modifier = Modifier
                    .width(25.dp)
                    .height(30.dp))
            },
            label = {
                Text(text = "Госномер")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )



        Column() {
            Text(text = "Формат: 0000XX00", fontSize = 12.sp)
            var gruz by remember { mutableStateOf("") }
            TextField(
                value = gruz,
                onValueChange = { newText ->
                    gruz = newText
                },

                label = {
                    Text(text = "Грузоподъемность (тон)", )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
            Text(text = "Дополнительные параметры", fontSize = 12.sp)


            Row(verticalAlignment = Alignment.CenterVertically) {
                val isChecked = remember { mutableStateOf(false) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = { isChecked.value = it },
                    enabled = true,
                    colors = CheckboxDefaults.colors(Color.Green)
                )
                Text( text = "Кондитцонер")
            }

        }



        Row( modifier = Modifier.fillMaxHeight().padding(10.dp),verticalAlignment = Alignment.Bottom) {
            Button(modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .width(140.dp),
                onClick = {
                    navController.navigate(Screen.RegisFive.route)
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
                     navController.navigate(Screen.RegisSeven.route)
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

