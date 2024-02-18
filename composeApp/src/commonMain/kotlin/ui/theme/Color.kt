package ui.theme

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * Created by Monil on 17/02/24.
 */

val Pink80 = Color(0xFFEFB8C8)

val Pink40 = Color(0xFF7D5260)

// Green
val GreenSurfie = Color(0xFF129575)

// Orange
val OrangePeel = Color(0xFFFF9C00)

// Grey
val GreyAlto = Color(0xFFD9D9D9)

// Element colors
@Composable
fun FJ_ButtonColors(): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = MaterialTheme.colorScheme.primary,
    contentColor = MaterialTheme.colorScheme.onPrimary,
    disabledContainerColor = GreyAlto,
    disabledContentColor = Color.White
)

@Composable
fun BlackWhiteGradientBrush(): Brush = remember {
    Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color.Black),
        startY = 10f,
        endY = 700f
    )
}
