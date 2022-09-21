package com.example.gramtaxi

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun UslIspol (navController: NavController) {
    Card(modifier = Modifier.fillMaxHeight().padding(16.dp), elevation = 10.dp) {


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 3.dp, bottom = 20.dp, top = 20.dp)
                //.background(Color.LightGray),
        ) {
            Column {
                Row(modifier = Modifier.padding(11.dp)) {
                    Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = "", tint = Color.Blue)
                    Text(text = "Назад", modifier = Modifier.fillMaxWidth(1f).clickable { navController.navigate(Screen.RegisOne.route) }, color = Color.Blue, )
                }
                Text(text = "Условия пользования",
                    modifier = Modifier.fillMaxWidth(1f),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold)
                val scrollState = rememberScrollState()
                Column(modifier = Modifier
                    .verticalScroll(scrollState)
                    .padding(start = 20.dp, end = 20.dp, bottom = 20.dp, top = 20.dp)) {
                    Text(text = "1. Общие положения\n" +
                            "1.1. Настоящее соглашение определяет порядок предоставления сервисом «Грам» (далее — Сервис), от имени которого на территории Республики Таджикистан действует Общество с ограниченной ответственностью «Инноватсияи ояндасоз», ИНН 000000000 права на использование базы данных, содержащей актуальные сведения о существующей потребности в услуге по перевозке пассажиров и багажа, услуге по перевозке грузов, погрузочно-разгрузочных работах.\n" +
                            "1.2. Если иное не предусмотрено отдельным договором Сторон, соглашение в соответствии со статьей 460 Гражданского кодекса Республики Таджикистан и статьей 27 Закона Республики Таджикистан «Об авторском праве и смежных правах» является договором присоединения и заключается в упрощенном порядке путем присоединения к условиям соглашения, размещенного в электронной форме на сайте Сервиса в сети Интернет по адресам https://gram.tj. Лицо, прошедшее процедуру регистрации, описанную в соглашении, считается принявшим соглашение, что равносильно заключению гражданско-правового договора на условиях, изложенных в настоящем документе.\n" +
                            "1.3. Прежде чем пройти процедуру регистрации, внимательно ознакомитесь с текстом соглашения и приложений к нему. В случае несогласия с какими-либо условиями Вам необходимо отказаться от использования базы данных.\n" +
                            "1.4. Соглашение является сублицензионным договором, к нему применяются положения, установленные статьями 25, 26 и 27 Закона Республики Таджикистан «Об авторском праве и смежных правах»\n" +
                            "1.5. Неотъемлемой частью соглашения является порядок использования базы данных Сервиса, размещенный в электронной форме на сайте Сервиса.\n" +
                            "1.6. Принятие условий настоящей Соглашения.")
                    Row() {
                        Button(modifier = Modifier
                            .padding(4.dp)
                            .height(50.dp)
                            .width(140.dp),
                            onClick = {
                                navController.navigate(Screen.RegisOne.route)
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
                                contentColor = Color.White)
                        ) {
                            Text( text = "Не принимаю", color = Color.White)
                        }
                        Spacer(modifier = Modifier.padding(1.dp))
                        ///////////////////////////////////////
                        Button(modifier = Modifier
                            .padding(4.dp)
                            .height(50.dp)
                            .width(140.dp),
                            onClick = {
                                navController.navigate(Screen.RegisOne.route)
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
                                contentColor = Color.White)
                        ) {
                            Text( text = "Принимаю", color = Color.White)
                        }

                    }
                }

            }
        }
    }
}

