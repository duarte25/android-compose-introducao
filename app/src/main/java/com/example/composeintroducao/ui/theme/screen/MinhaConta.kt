package com.example.composeintroducao.ui.theme.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeintroducao.R

@Composable
fun MinhaConta(
    navController: NavController
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Minha Conta",
                modifier = Modifier
                    .padding(bottom = 20.dp),
                style = MaterialTheme.typography.headlineMedium
            )

            Box {
                Image(
                    painter = painterResource(id = R.mipmap.monalisaperfil),
                    contentDescription = "Perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(150.dp)
                )

                Button(
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.BottomEnd),
                         colors = ButtonDefaults.run { val buttonColors =
                            buttonColors(Color(0xFFB16741))
                            buttonColors
                         }

                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_edit),
                        contentDescription = "Editar"
                    )
                }
            }

            Text(
                "Gustavo Duarte",
                Modifier
                    .padding(top = 20.dp),
                    style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "duarte.guga2025@gmail.com",
                Modifier
                    .alpha(0.5f) // Define a opacidade para 50%
                    .then(Modifier.sizeIn(minWidth = 50.dp, minHeight = 50.dp)), // Tamanho mínimo do texto
                fontSize = 10.sp // Tamanho da fonte do texto
            )

            Button(
                onClick = {
                    navController.navigate("inicio")
                },
                        colors = ButtonDefaults.run { val buttonColors =
                            buttonColors(Color(0xFFB16741))
                            buttonColors
                        }
            )
            {
                Text("Sair")
            }
        }
    }
}

@Preview
@Composable
fun MinhaContaPreview() {
    MaterialTheme {
        MinhaConta(rememberNavController())
    }
}
