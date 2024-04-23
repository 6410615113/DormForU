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
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.ui.theme.IconColor
import com.example.myapp.ui.ui.theme.MyAppTheme

@Composable
fun rememberAccountCircle(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "account_circle",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
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
                moveTo(9.583f, 29.083f)
                quadToRelative(2.459f, -1.75f, 4.979f, -2.687f)
                quadToRelative(2.521f, -0.938f, 5.438f, -0.938f)
                reflectiveQuadToRelative(5.438f, 0.938f)
                quadToRelative(2.52f, 0.937f, 5.02f, 2.687f)
                quadToRelative(1.75f, -2.125f, 2.521f, -4.354f)
                quadToRelative(0.771f, -2.229f, 0.771f, -4.729f)
                quadToRelative(0f, -5.833f, -3.958f, -9.792f)
                quadTo(25.833f, 6.25f, 20f, 6.25f)
                reflectiveQuadToRelative(-9.792f, 3.958f)
                quadTo(6.25f, 14.167f, 6.25f, 20f)
                quadToRelative(0f, 2.5f, 0.792f, 4.729f)
                quadToRelative(0.791f, 2.229f, 2.541f, 4.354f)
                close()
                moveTo(20f, 21.333f)
                quadToRelative(-2.417f, 0f, -4.062f, -1.645f)
                quadToRelative(-1.646f, -1.646f, -1.646f, -4.063f)
                quadToRelative(0f, -2.375f, 1.646f, -4.021f)
                quadTo(17.583f, 9.958f, 20f, 9.958f)
                quadToRelative(2.417f, 0f, 4.062f, 1.646f)
                quadToRelative(1.646f, 1.646f, 1.646f, 4.021f)
                quadToRelative(0f, 2.417f, -1.646f, 4.063f)
                quadToRelative(-1.645f, 1.645f, -4.062f, 1.645f)
                close()
                moveToRelative(0f, 15.042f)
                quadToRelative(-3.375f, 0f, -6.375f, -1.292f)
                quadToRelative(-3f, -1.291f, -5.208f, -3.521f)
                quadToRelative(-2.209f, -2.229f, -3.5f, -5.208f)
                quadTo(3.625f, 23.375f, 3.625f, 20f)
                reflectiveQuadToRelative(1.292f, -6.375f)
                quadToRelative(1.291f, -3f, 3.521f, -5.208f)
                quadToRelative(2.229f, -2.209f, 5.208f, -3.5f)
                quadTo(16.625f, 3.625f, 20f, 3.625f)
                reflectiveQuadToRelative(6.375f, 1.292f)
                quadToRelative(3f, 1.291f, 5.208f, 3.521f)
                quadToRelative(2.209f, 2.229f, 3.5f, 5.208f)
                quadToRelative(1.292f, 2.979f, 1.292f, 6.354f)
                reflectiveQuadToRelative(-1.292f, 6.375f)
                quadToRelative(-1.291f, 3f, -3.521f, 5.208f)
                quadToRelative(-2.229f, 2.209f, -5.208f, 3.5f)
                quadToRelative(-2.979f, 1.292f, -6.354f, 1.292f)
                close()
                moveToRelative(0f, -2.625f)
                quadToRelative(2.25f, 0f, 4.312f, -0.646f)
                quadToRelative(2.063f, -0.646f, 4.063f, -2.146f)
                quadToRelative(-2f, -1.416f, -4.083f, -2.146f)
                quadToRelative(-2.084f, -0.729f, -4.292f, -0.729f)
                quadToRelative(-2.208f, 0f, -4.313f, 0.729f)
                quadToRelative(-2.104f, 0.73f, -4.062f, 2.146f)
                quadToRelative(2f, 1.5f, 4.063f, 2.146f)
                quadToRelative(2.062f, 0.646f, 4.312f, 0.646f)
                close()
                moveToRelative(0f, -15.042f)
                quadToRelative(1.333f, 0f, 2.188f, -0.875f)
                quadToRelative(0.854f, -0.875f, 0.854f, -2.208f)
                quadToRelative(0f, -1.333f, -0.854f, -2.187f)
                quadToRelative(-0.855f, -0.855f, -2.188f, -0.855f)
                quadToRelative(-1.333f, 0f, -2.188f, 0.855f)
                quadToRelative(-0.854f, 0.854f, -0.854f, 2.187f)
                quadToRelative(0f, 1.333f, 0.854f, 2.208f)
                quadToRelative(0.855f, 0.875f, 2.188f, 0.875f)
                close()
                moveToRelative(0f, -3.083f)
                close()
                moveToRelative(0f, 15.292f)
                close()
            }
        }.build()
    }
}
@Preview(showBackground = true)
@Composable
fun rememberAccountCirclePreview() {
    MyAppTheme {
        Image(
            imageVector = rememberAccountCircle(),
            contentDescription = null
        )
    }
}