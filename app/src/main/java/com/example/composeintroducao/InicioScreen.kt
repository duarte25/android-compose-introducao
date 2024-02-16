package com.example.aplicacao1.ui.theme

import com.example.composeintroducao.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Inicio() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Exibe a imagem em um componente Image
            Image(
                painter = painterResource(id = R.drawable.ifro_campus_vertical),
                contentDescription = "Logo IFRO",
                modifier = Modifier.size(150.dp)
            )


            Text("Não autenticado")
            Button(
                onClick = {

                }
            ) {
                Text("Minha conta")
            }
        }
    }
}

@Preview
@Composable
fun InicioPreview() {
    MaterialTheme {
        Inicio()
    }
}
