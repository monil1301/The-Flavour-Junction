package ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import theflavourjunction.composeapp.generated.resources.Res
import theflavourjunction.composeapp.generated.resources.*

/**
 * Created by Monil on 17/02/24.
 */

@OptIn(ExperimentalResourceApi::class)
val Poppins: FontFamily
    @Composable
    get() {
        return FontFamily(
            Font(
                Res.font.poppins_regular,
                weight = FontWeight.Normal
            ),
            Font(Res.font.poppins_bold, weight = FontWeight.Bold)
        )
    }

// Text Styles with NORMAL font weight
val smallerRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            lineHeight = 27.sp,
        )
    }

val smallRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 21.sp,
        )
    }

val normalRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
        )
    }

val mediumRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            lineHeight = 27.sp,
        )
    }

val largeRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 30.sp,
        )
    }

val headerRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 30.sp,
            lineHeight = 45.sp,
        )
    }

val titleRegular: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp,
            lineHeight = 75.sp,
        )
    }


// Text Styles with BOLD font weight
val smallerBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 11.sp,
            lineHeight = 27.sp,
        )
    }

val smallBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            lineHeight = 21.sp,
        )
    }

val normalBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
        )
    }

val mediumBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            lineHeight = 27.sp,
        )
    }

val largeBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 30.sp,
        )
    }

val headerBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            lineHeight = 45.sp,
        )
    }

val titleBold: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            lineHeight = 60.sp,
        )
    }

// Shapes
val buttonShape = RoundedCornerShape(10.dp)
