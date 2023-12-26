package dev.bellu.pynitewallet.presentation.screens.welcome

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import components.ButtonSample
import dev.bellu.pynitewallet.R
import utils.Colors
import utils.TextManager

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginOptionsScreen() {
    val scaffoldState = rememberScaffoldState()

    val colorsLinearGradient = listOf(
        Colors.primary.copy(alpha = 0.9f),
        Colors.secondary.copy(alpha = 1.0f),
    )


    Scaffold(
        scaffoldState = scaffoldState,
        content = {
            Box(
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
                    painter = painterResource(R.drawable.logo_letter),
                    contentDescription = null,
                    modifier = Modifier.padding(16.dp)
                )
                Image(
                    painter = painterResource(R.drawable.shield1),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                )
                Image(
                    painter = painterResource(R.drawable.mockup_ln),
                    contentDescription = null,
                    modifier = Modifier
                        .height(252.13.dp)
                        .width(246.07.dp)
                        .align(Alignment.BottomEnd)
                )
                Image(
                    painter = painterResource(R.drawable.shield2),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.65f)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "It is a long-established fact that a reader",
                        style = TextManager.bigWhite,
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .padding(bottom = 18.dp)
                    )
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                "Choose your login:",
                                style = TextManager.superSmall,
                                modifier = Modifier.padding(bottom = 25.dp)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            ButtonSample(
                                title = "E-mail",
                                onClick = {},
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            ButtonSample(
                                title = "Lightning Network",
                                onClick = {}
                            )
                    }
                }
            }
        }
    )
}


