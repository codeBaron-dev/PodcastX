package com.codebaron.podcast.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codebaron.podcast.R

// Set of Material typography styles to start with
val QuickSandTypography = FontFamily(
    Font(R.font.quicksand_regular),
    Font(R.font.quicksand_bold, FontWeight.Bold),
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_semi_bold, FontWeight.SemiBold),
    Font(R.font.quicksand_medium, FontWeight.Medium)
)
val Typography = Typography(
    h3 = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ),
    h2 = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold
    ),
    h1 = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 100.sp,
        fontWeight = FontWeight.ExtraBold
    ),
    body2 = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 12.sp
    ),
    body1 = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = QuickSandTypography,
        fontSize = 12.sp
    )

)