package com.example.navigationcompose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.Fragments.Routes
import com.example.navigationcompose.Fragments.ScreenA
import com.example.navigationcompose.Fragments.ScreenB

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA) {
        composable(Routes.screenA){
            ScreenA(navController)
        }
        composable(Routes.screenB +"/{name}"){
            val name =it.arguments?.getString("name")
            ScreenB(name?:"No name!")
        }
    }
}