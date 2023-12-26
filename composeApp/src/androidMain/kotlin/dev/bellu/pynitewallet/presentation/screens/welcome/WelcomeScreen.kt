package dev.bellu.pynitewallet.presentation.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import dev.bellu.pynitewallet.R
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import utils.Colors

@Composable
fun WelcomeScreen(navController: NavController) {

    LaunchedEffect(Unit){
        delay(1000)
        navController.navigate("login")
    }

    val colorsLinearGradient = listOf(
        Colors.primary.copy(alpha = 0.9f),
        Colors.secondary.copy(alpha = 1.0f),
    )

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = colorsLinearGradient,
                start = Offset(0f, 0f),
                end = Offset(-3500f, 3500f),
                tileMode = TileMode.Clamp
            )
        )
    ) {
        Image(
            painter = painterResource(R.drawable.shield1),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
        )
        Image(
            painter = painterResource(R.drawable.shield2),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.BottomStart)
        )
        Box(modifier = Modifier
            .height(200.19.dp)
            .width(180.dp)
        ){
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Pynite"
            )
        }
    }
}
