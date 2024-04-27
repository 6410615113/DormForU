package com.example.myapp.ui.materials

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme
import com.example.myapp.ui.ui.theme.IconColor


@Composable
fun rememberHeartPlus(
    defaultWidth: Dp = 40.0.dp,
    defaultHeight: Dp = 40.0.dp,
    viewportWidth: Float = 40.0f,
    viewportHeight: Float = 40.0f
): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "heart_plus",
            defaultWidth = defaultWidth,
            defaultHeight = defaultHeight,
            viewportWidth = viewportWidth,
            viewportHeight = viewportHeight
        ).apply {
            path(
                fill = SolidColor(IconColor),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(18.333f, 19.208f)
                close()
                moveToRelative(0f, 15.459f)
                lineTo(14.917f, 31.5f)
                quadToRelative(-3.792f, -3.417f, -6.292f, -5.896f)
                reflectiveQuadToRelative(-3.979f, -4.458f)
                quadToRelative(-1.479f, -1.979f, -2.084f, -3.688f)
                quadToRelative(-0.604f, -1.708f, -0.604f, -3.583f)
                quadToRelative(0f, -3.75f, 2.5f, -6.292f)
                quadToRelative(2.5f, -2.541f, 6.167f, -2.541f)
                quadToRelative(2.292f, 0f, 4.271f, 1.041f)
                quadToRelative(1.979f, 1.042f, 3.437f, 3.042f)
                quadTo(20f, 7.042f, 21.896f, 6.042f)
                quadToRelative(1.896f, -1f, 4.146f, -1f)
                quadToRelative(3.291f, 0f, 5.583f, 2.166f)
                quadToRelative(2.292f, 2.167f, 2.833f, 5.292f)
                horizontalLineToRelative(-2.666f)
                quadToRelative(-0.417f, -2.083f, -1.938f, -3.458f)
                reflectiveQuadToRelative(-3.812f, -1.375f)
                quadToRelative(-2.084f, 0f, -3.834f, 1.229f)
                reflectiveQuadToRelative(-2.75f, 3.437f)
                horizontalLineToRelative(-2.25f)
                quadToRelative(-1f, -2.166f, -2.77f, -3.416f)
                quadToRelative(-1.771f, -1.25f, -3.813f, -1.25f)
                quadToRelative(-2.625f, 0f, -4.333f, 1.771f)
                quadToRelative(-1.709f, 1.77f, -1.709f, 4.395f)
                quadToRelative(0f, 1.584f, 0.625f, 3.105f)
                quadToRelative(0.625f, 1.52f, 2.167f, 3.437f)
                quadToRelative(1.542f, 1.917f, 4.208f, 4.5f)
                quadToRelative(2.667f, 2.583f, 6.75f, 6.292f)
                quadToRelative(1.25f, -1.125f, 2.355f, -2.105f)
                lineToRelative(2.187f, -1.937f)
                lineToRelative(0.292f, 0.292f)
                lineToRelative(0.625f, 0.625f)
                lineToRelative(0.625f, 0.625f)
                lineToRelative(0.291f, 0.291f)
                quadToRelative(-1.041f, 0.959f, -2.146f, 1.938f)
                quadToRelative(-1.104f, 0.979f, -2.395f, 2.104f)
                close()
                moveToRelative(11.459f, -6.417f)
                verticalLineToRelative(-5.292f)
                horizontalLineToRelative(-5.25f)
                verticalLineToRelative(-2.625f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(-5.291f)
                horizontalLineToRelative(2.666f)
                verticalLineToRelative(5.291f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(2.625f)
                horizontalLineToRelative(-5.25f)
                verticalLineToRelative(5.292f)
                close()
            }
        }.build()
    }
}
@Preview(showBackground = true)
@Composable
fun rememberHeartPlusPreview() {
    MyAppTheme {
        Image(
            imageVector = rememberHeartPlus(),
            contentDescription = null
        )
    }
}