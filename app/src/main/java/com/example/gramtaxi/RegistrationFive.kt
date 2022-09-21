package com.example.gramtaxi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
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

@Composable
fun RegisFive(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(), verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier.padding(20.dp),
            text = "Регистрация",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Image(painter = painterResource(id = R.drawable.gramfive),
            contentDescription = "",
            modifier = Modifier
                .width(190.dp)
                .height(50.dp))
        Text(modifier = Modifier.padding(15.dp), text = "Паспорт", fontSize = 15.sp, fontWeight = FontWeight.Bold)

        var seri by remember { mutableStateOf("") }
        TextField(
            value = seri,
            onValueChange = { newText ->
                seri = newText
            },
            leadingIcon = {
                Image(painterResource(id = R.drawable.gram), contentDescription = null, modifier = Modifier.width(25.dp).height(30.dp))
            },
            label = {
                Text(text = "Серия и номер")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )


        var destvi by remember { mutableStateOf("") }
        TextField(
            value = destvi,
            onValueChange = { newText ->
                destvi = newText
            },
            label = {
                Text(text = "Действительно до")
            },
            // keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )

        Row( modifier = Modifier.fillMaxHeight().padding(10.dp),verticalAlignment = Alignment.Bottom) {
            Button(modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .width(140.dp),
                onClick = {
                    navController.navigate(Screen.RegisFour.route)
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
                    navController.navigate(Screen.RegisSix.route)
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
