package com.example.gramtaxi

sealed class Screen (val route: String){
    object Authorization : Screen("Authorization_screen")
    object Registration : Screen("Registration_screen")
    object SplashScreen : Screen("SplashScreen_screen")
    object RegisOne : Screen("RegisOne_screen")
    object RegisTwo : Screen("RegisTwo_screen")
    object UslIspol : Screen ("UslIspol_screen")
    object RegisThree : Screen ("RegisThree_screen")
    object RegisFour : Screen ("RegisFour_screen")
    object RegisFive : Screen ("RegisFive_screen")
    object RegisSix : Screen ("RegisSix_screen")
    object RegisSeven : Screen ("RegisSeven_screen")
    object PanelNavigation : Screen ("PanelNavigation_screen")

}
