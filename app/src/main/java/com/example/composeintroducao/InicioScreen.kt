package com.example.aplicacao1.ui.theme

import com.example.composeintroducao.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
            Text("Não autenticado", Modifier.padding(bottom = 20.dp))
            Button(
                onClick = {

                },
                modifier = Modifier
                    .padding(top = 15.dp)
                    .size(width = 150.dp, height = 50.dp),
                colors = ButtonDefaults.run { val buttonColors =
                    buttonColors(Color(0xFFB16741))
                    buttonColors
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
