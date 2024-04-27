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
import com.example.myapp.ui.ui.theme.MyAppTheme

@Composable
fun rememberPriceChange(
    defaultWidth: Dp = 40.0.dp,
    defaultHeight: Dp = 40.0.dp,
    viewportWidth: Float = 40.0f,
    viewportHeight: Float = 40.0f,
    color: Color = Color.Yellow
): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "price_change",
            defaultWidth = defaultWidth,
            defaultHeight = defaultHeight,
            viewportWidth = viewportWidth,
            viewportHeight = viewportHeight
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.417f, 26.583f)
                horizontalLineToRelative(2.125f)
                verticalLineToRelative(0.459f)
                quadToRelative(0f, 0.541f, 0.396f, 0.937f)
                quadToRelative(0.395f, 0.396f, 0.937f, 0.396f)
                reflectiveQuadToRelative(0.937f, -0.396f)
                quadToRelative(0.396f, -0.396f, 0.396f, -0.937f)
                verticalLineToRelative(-0.459f)
                horizontalLineToRelative(1.917f)
                quadToRelative(0.625f, 0f, 1.042f, -0.5f)
                quadToRelative(0.416f, -0.5f, 0.416f, -1.125f)
                verticalLineToRelative(-4.75f)
                quadToRelative(0f, -0.666f, -0.416f, -1.125f)
                quadToRelative(-0.417f, -0.458f, -1.042f, -0.458f)
                horizontalLineToRelative(-5.417f)
                verticalLineToRelative(-2.583f)
                horizontalLineToRelative(5.584f)
                quadToRelative(0.541f, 0f, 0.916f, -0.375f)
                reflectiveQuadToRelative(0.375f, -0.959f)
                quadToRelative(0f, -0.541f, -0.395f, -0.916f)
                quadToRelative(-0.396f, -0.375f, -0.938f, -0.375f)
                horizontalLineToRelative(-2.042f)
                verticalLineToRelative(-0.459f)
                quadToRelative(0f, -0.541f, -0.396f, -0.937f)
                quadToRelative(-0.395f, -0.396f, -0.937f, -0.396f)
                reflectiveQuadToRelative(-0.937f, 0.396f)
                quadToRelative(-0.396f, 0.396f, -0.396f, 0.937f)
                verticalLineToRelative(0.459f)
                horizontalLineToRelative(-1.875f)
                quadToRelative(-0.667f, 0f, -1.125f, 0.5f)
                quadToRelative(-0.459f, 0.5f, -0.459f, 1.125f)
                verticalLineToRelative(4.75f)
                quadToRelative(0f, 0.625f, 0.459f, 1.062f)
                quadToRelative(0.458f, 0.438f, 1.125f, 0.438f)
                horizontalLineToRelative(5.291f)
                verticalLineToRelative(2.666f)
                horizontalLineToRelative(-5.583f)
                quadToRelative(-0.542f, 0f, -0.917f, 0.375f)
                reflectiveQuadToRelative(-0.375f, 0.917f)
                quadToRelative(0f, 0.583f, 0.375f, 0.958f)
                reflectiveQuadToRelative(0.959f, 0.375f)
                close()
                moveToRelative(15f, -0.125f)
                quadToRelative(0.166f, 0.25f, 0.458f, 0.25f)
                quadToRelative(0.292f, 0f, 0.5f, -0.25f)
                lineToRelative(2.167f, -2.125f)
                horizontalLineTo(24.25f)
                close()
                moveTo(24.25f, 16.042f)
                horizontalLineToRelative(5.292f)
                lineToRelative(-2.167f, -2.125f)
                quadToRelative(-0.208f, -0.209f, -0.479f, -0.209f)
                reflectiveQuadToRelative(-0.479f, 0.209f)
                close()
                moveToRelative(-18f, 17.041f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.791f)
                quadToRelative(-0.771f, -0.792f, -0.771f, -1.834f)
                verticalLineTo(9.542f)
                quadToRelative(0f, -1.042f, 0.771f, -1.834f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.834f)
                verticalLineToRelative(20.916f)
                quadToRelative(0f, 1.042f, -0.771f, 1.834f)
                quadToRelative(-0.771f, 0.791f, -1.854f, 0.791f)
                close()
                moveToRelative(0f, -2.625f)
                verticalLineTo(9.542f)
                verticalLineToRelative(20.916f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(27.5f)
                verticalLineTo(9.542f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(20.916f)
                close()
            }
        }.build()
    }
}
@Preview(showBackground = true)
@Composable
fun rememberPriceChangePreview() {
    MyAppTheme {
        Image(
            imageVector = rememberPriceChange(),
            contentDescription = null
        )
    }
}