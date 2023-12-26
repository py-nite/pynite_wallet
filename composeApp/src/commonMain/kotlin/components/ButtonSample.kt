package components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import utils.Colors
import utils.TextManager

@Composable
fun ButtonSample(
    title: String,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
        .fillMaxWidth(0.8f)
        .height(50.dp)
        .background(
            color = Colors.onTertiary,
            shape = RoundedCornerShape(size = 30.dp)
        )
            .clickable { onClick() }
    ) {
        Text(
            text = title,
            style = TextManager.smallBlack
        )
    }
}