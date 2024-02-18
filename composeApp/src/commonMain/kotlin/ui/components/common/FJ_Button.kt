package ui.components.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import enums.ViewPosition
import ui.theme.FJ_ButtonColors
import ui.theme.TheFlavourJunctionTheme
import ui.theme.buttonShape

/**
 * Created by Monil on 19/02/24.
 */

@Composable
fun FJ_Button(
    // Button parameters
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = buttonShape,
    colors: ButtonColors = FJ_ButtonColors(),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },

    // Content parameters
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.labelMedium,

    // Showing icon at start or end of the text
    iconPosition: ViewPosition = ViewPosition.End,
    icon: ImageVector? = null,
    iconDescription: String? = null,
    iconPadding: Dp = 12.dp
) {
    TheFlavourJunctionTheme {
        Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            colors = colors,
            elevation = elevation,
            border = border,
            contentPadding = contentPadding,
            interactionSource = interactionSource
        ) {
            FJ_Text(text = text, style = textStyle, iconPosition = iconPosition, icon = icon, iconDescription = iconDescription, iconPadding = iconPadding)
        }
    }
}
