package utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

object Colors{
    val primary = Color(0xFF000A0A)
    val onPrimary = Color(0)
    val secondary = Color(0xFFFB3C52)
    val onSecondary = Color(0)
    val tertiary = Color(0xFFFFFFFF)
    val onTertiary = Color(0xFF9DEFEA)
}

object TextManager{
    val smallBlack = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight(500),
        color = Colors.primary,
        textAlign = TextAlign.Center,
        letterSpacing = 1.28.sp,
    )

    val superSmall = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight(500),
        color = Colors.tertiary,
        textAlign = TextAlign.Center,
        letterSpacing = 1.6.sp,
    )
    val bigWhite = TextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight(500),
        color = Colors.tertiary,
        textAlign = TextAlign.Center,
        letterSpacing = 0.4.sp
    )
}
