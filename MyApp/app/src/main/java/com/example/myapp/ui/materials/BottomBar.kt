package com.example.myapp.ui.materials
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.ui.theme.BackGroundColorTheme
import com.example.myapp.ui.ui.theme.BackGroundColorTheme1
import com.example.myapp.ui.ui.theme.IconColor

import com.example.myapp.ui.ui.theme.MyAppTheme
import rememberHome

@Composable
fun bottomBar() {
    val list = listOf("Home", "Heart", "Account")
    var select by remember { mutableStateOf(BackGroundColorTheme1) }
    var select1 by remember { mutableStateOf(BackGroundColorTheme) }
    var select2 by remember { mutableStateOf(BackGroundColorTheme) }

    Row(
        modifier = Modifier
            .background(
                color = Color(0xFFccf0fb),
                shape = RoundedCornerShape(50, 50, 0, 0)
            )
            .height(80.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Bottom
    ) {
        Box(
            Modifier
                .background(select, shape = RoundedCornerShape(50, 0, 0, 0))
                .weight(1f)
                .fillMaxHeight()
                .clickable {
                    select = BackGroundColorTheme1
                    select1 = BackGroundColorTheme
                    select2 = BackGroundColorTheme
                },
            contentAlignment = Alignment.Center,

        ) {
            Image(
                imageVector = rememberHome(),
                contentDescription = null,


                )
        }
        Box(
            Modifier
                .background(select1, shape = RoundedCornerShape(0, 0, 0, 0))
                .weight(1f)
                .fillMaxHeight()
                .clickable {
                    select = BackGroundColorTheme
                    select1 = BackGroundColorTheme1
                    select2 = BackGroundColorTheme
                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = null,
                modifier = Modifier
                    .scale(2f),
                colorFilter = ColorFilter.tint(IconColor)

            )
        }
        Box(
            Modifier
                .background(select2, shape = RoundedCornerShape(0, 50, 0, 0))
                .weight(1f)
                .fillMaxHeight()
                .clickable {
                    select = BackGroundColorTheme
                    select1 = BackGroundColorTheme
                    select2 = BackGroundColorTheme1
                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = rememberAccountCircle(),
                contentDescription = null,


                )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun bottomBarPreview() {
    MyAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = BackGroundColorTheme
        ) {
            bottomBar()
        }
    }
}