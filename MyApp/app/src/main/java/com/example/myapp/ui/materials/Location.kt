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
fun rememberLocationCity(
    defaultWidth: Dp = 40.0.dp,
    defaultHeight: Dp = 40.0.dp,
    viewportWidth: Float = 40.0f,
    viewportHeight: Float = 40.0f,
    color: Color = Color.Red
): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "location_city",
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
                moveTo(8.292f, 34.208f)
                quadToRelative(-1.125f, 0f, -1.896f, -0.77f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.855f)
                verticalLineTo(14.542f)
                quadToRelative(0f, -1.084f, 0.792f, -1.854f)
                quadToRelative(0.791f, -0.771f, 1.875f, -0.771f)
                horizontalLineToRelative(7.125f)
                verticalLineTo(9.458f)
                quadToRelative(0f, -0.25f, 0.062f, -0.5f)
                quadToRelative(0.063f, -0.25f, 0.146f, -0.5f)
                quadToRelative(0.083f, -0.25f, 0.229f, -0.458f)
                quadToRelative(0.146f, -0.208f, 0.313f, -0.417f)
                lineToRelative(2.916f, -2.875f)
                quadToRelative(0.417f, -0.333f, 0.938f, -0.354f)
                quadToRelative(0.521f, -0.021f, 0.896f, 0.354f)
                lineToRelative(2.916f, 2.875f)
                quadToRelative(0.375f, 0.375f, 0.584f, 0.875f)
                quadToRelative(0.208f, 0.5f, 0.208f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(7.125f)
                quadToRelative(1.083f, 0f, 1.854f, 0.771f)
                quadToRelative(0.771f, 0.771f, 0.771f, 1.896f)
                verticalLineToRelative(10.458f)
                quadToRelative(0f, 1.084f, -0.771f, 1.855f)
                quadToRelative(-0.771f, 0.77f, -1.854f, 0.77f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.916f)
                horizontalLineTo(8.292f)
                close()
                moveToRelative(0f, -6.541f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.917f)
                horizontalLineTo(8.292f)
                close()
                moveToRelative(0f, -6.584f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.916f)
                horizontalLineTo(8.292f)
                close()
                moveToRelative(9.75f, 13.125f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.916f)
                horizontalLineToRelative(-3.916f)
                close()
                moveToRelative(0f, -6.541f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.917f)
                horizontalLineToRelative(-3.916f)
                close()
                moveToRelative(0f, -6.584f)
                horizontalLineToRelative(3.916f)
                verticalLineToRelative(-3.916f)
                horizontalLineToRelative(-3.916f)
                close()
                moveToRelative(0f, -6.541f)
                horizontalLineToRelative(3.916f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3.916f)
                close()
                moveToRelative(9.791f, 19.666f)
                horizontalLineToRelative(3.917f)
                verticalLineToRelative(-3.916f)
                horizontalLineToRelative(-3.917f)
                close()
                moveToRelative(0f, -6.541f)
                horizontalLineToRelative(3.917f)
                verticalLineToRelative(-3.917f)
                horizontalLineToRelative(-3.917f)
                close()
            }
        }.build()
    }
}
@Preview(showBackground = true)
@Composable
fun rememberLocationCityPreview() {
    MyAppTheme {
        Image(
            imageVector = rememberLocationCity(),
            contentDescription = null
        )
    }
}