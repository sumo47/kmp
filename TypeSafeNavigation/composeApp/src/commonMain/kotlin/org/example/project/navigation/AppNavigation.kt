package org.example.project.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LoginPage) {
        composable<Routes.LoginPage> {
            fun redirect() {
                navController.popBackStack() // not good approach
                navController.navigate(Routes.HomePage)
            }
            LoginPage { redirect() }
        }

        composable<Routes.HomePage> {
            fun redirect() {

                navController.navigate(Routes.LoginPage){
                    // another way to pop previous directory form pipeline
                    popUpTo(Routes.HomePage){
                        inclusive = true
                    }

                }
            }
            HomePage { redirect() }
        }
    }
}

@Composable
private fun LoginPage(onClick: () -> Unit) {
    Box(
        Modifier.fillMaxSize(1f),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Login Page", Modifier.clickable { onClick() })
    }
}

@Composable
private fun HomePage(onClick: () -> Unit) {
    Box(
        Modifier.fillMaxSize(1f),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Home Page", Modifier.clickable { onClick() })
    }

}