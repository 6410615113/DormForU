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
fun rememberSmartphone(
    defaultWidth: Dp = 40.0.dp,
    defaultHeight: Dp = 40.0.dp,
    viewportWidth: Float = 40.0f,
    viewportHeight: Float = 40.0f,
    color: Color = Color.Green
): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "smartphone",
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
                moveTo(11.208f, 38.042f)
                quadToRelative(-1.083f, 0f, -1.875f, -0.771f)
                quadToRelative(-0.791f, -0.771f, -0.791f, -1.854f)
                verticalLineTo(4.583f)
                quadToRelative(0f, -1.083f, 0.791f, -1.854f)
                quadToRelative(0.792f, -0.771f, 1.875f, -0.771f)
                horizontalLineToRelative(17.584f)
                quadToRelative(1.083f, 0f, 1.875f, 0.771f)
                quadToRelative(0.791f, 0.771f, 0.791f, 1.854f)
                verticalLineToRelative(30.834f)
                quadToRelative(0f, 1.083f, -0.791f, 1.854f)
                quadToRelative(-0.792f, 0.771f, -1.875f, 0.771f)
                close()
                moveToRelative(0f, -6.709f)
                horizontalLineToRelative(17.584f)
                verticalLineTo(8.667f)
                horizontalLineTo(11.208f)
                close()
                moveToRelative(0f, 2.625f)
                verticalLineToRelative(1.459f)
                horizontalLineToRelative(17.584f)
                verticalLineToRelative(-1.459f)
                close()
                moveToRelative(0f, -27.916f)
                horizontalLineToRelative(17.584f)
                verticalLineTo(4.583f)
                horizontalLineTo(11.208f)
                close()
                moveToRelative(0f, -1.459f)
                verticalLineToRelative(1.459f)
                verticalLineToRelative(-1.459f)
                close()
                moveToRelative(0f, 30.834f)
                verticalLineToRelative(-1.459f)
                verticalLineToRelative(1.459f)
                close()
            }
        }.build()
    }
}
@Preview(showBackground = true)
@Composable
fun rememberSmartphonePreview() {
    MyAppTheme {
        Image(
            imageVector = rememberSmartphone(),
            contentDescription = null
        )
    }
}