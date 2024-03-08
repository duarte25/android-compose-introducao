package com.example.composeintroducao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacao1.ui.theme.InicioScreen
import com.example.aplicacao1.ui.theme.Login2Screen
import com.example.composeintroducao.ui.theme.screen.MinhaConta
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {

        composable("inicio") {
            InicioScreen(navController)
        }
        composable("login") {
            Login2Screen(navController)
        }
        composable("minhaconta") {
            MinhaConta(navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Navigation()
}