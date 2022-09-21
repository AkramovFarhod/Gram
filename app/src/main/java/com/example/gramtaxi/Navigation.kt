package com.example.gramtaxi

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Authorization.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.Registration.route) {
            Registration(navController = navController)
        }
        composable(route = Screen.RegisOne.route) {
            RegisOne(navController = navController)
        }
        composable(route = Screen.RegisTwo.route) {
            RegisTwo(navController = navController)
        }
        composable(route = Screen.UslIspol.route) {
            UslIspol(navController = navController)
        }
        composable(route = Screen.RegisThree.route) {
            RegisThee(navController = navController)
        }
        composable(route = Screen.RegisFour.route) {
            RegisFour(navController = navController)
        }
        composable(route = Screen.RegisFive.route) {
            RegisFive(navController = navController)
        }
        composable(route = Screen.RegisSix.route) {
            RegisSix(navController = navController)
        }
        composable(route = Screen.RegisSeven.route) {
            RegisSeven(navController = navController)
        }
//        composable(route = Screen.PanelNavigeshon.route){
//            PanelNavigeshon(navController = navController)
//        }

    }
}
