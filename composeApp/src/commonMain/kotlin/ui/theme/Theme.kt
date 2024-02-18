package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Created by Monil on 17/02/24.
 */

val darkColorScheme = darkColorScheme(
    primary = GreenSurfie,
    secondary = OrangePeel,
    tertiary = Pink80
)

val lightColorScheme = lightColorScheme(
    primary = GreenSurfie,
    secondary = OrangePeel,
    tertiary = Pink40
)

@Composable
fun TheFlavourJunctionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) darkColorScheme else lightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
