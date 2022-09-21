package com.example.gramtaxi

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(21.dp),

        ) {
        /////////
        Text(modifier = Modifier.padding(66.dp),
            text = "Gram ",
            fontSize = 59.sp,/*fontWeight = FontWeight.Bold*/)
        ////////

        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text = "Логин")
            }
        )

        ////////////
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisible by rememberSaveable { mutableStateOf(false) }

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            singleLine = true,
            placeholder = { Text("Пароль") },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image = if (passwordVisible)
                    Icons.Filled.Visibility
                else Icons.Filled.VisibilityOff

                // Please provide localized description for accessibility services
                val description = if (passwordVisible) "Hide password" else "Show password"

                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = image, description)
                }

            }
        )
        Button(modifier = Modifier
            .padding(1.dp)
            .fillMaxWidth()
            .height(60.dp),
            onClick = {
            //your onclick code here
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black, contentColor = Color.White),
            elevation =  ButtonDefaults.elevation(
            defaultElevation = 10.dp,
            pressedElevation = 10.dp,
            disabledElevation = 10.dp
        )) {
            Text(text = "Войти", fontSize = 18.sp)
        }
        Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom){
            Text(text ="Не зарегистрированы?", )
            Text(text ="Регистрация", color = Color.Blue,
            modifier = Modifier.clickable {
                navController.navigate(Screen.Registration.route)

            })

        }
        }
    }


