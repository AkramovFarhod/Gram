package com.example.gramtaxi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun RegisSeven (navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(), verticalArrangement = Arrangement.spacedBy(23.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier.padding(15.dp),
            text = "Регистрация",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Image(painter = painterResource(id = R.drawable.gramseven),
            contentDescription = "",
            modifier = Modifier
                .width(170.dp)
                .height(60.dp))
        Text(text = "Регистрация завершена", fontSize = 15.sp, fontWeight = FontWeight.Bold)
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = "Мы отправили",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)
            Text(text = "вам СМС с логином",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)
            Text(text = "и паролем",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)
        }
        Column() {
            Text(text = "Запустите DGram и выполните",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)
            Text(text = "первый заказ",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Button(modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth()
                .height(60.dp),
                onClick = {
                    navController.navigate(Screen.PanelNavigation.route)
                },

                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
                    contentColor = Color.White),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 10.dp,
                    disabledElevation = 10.dp
                )){
                Text(text = "Войти")
            }
        }


    }
}