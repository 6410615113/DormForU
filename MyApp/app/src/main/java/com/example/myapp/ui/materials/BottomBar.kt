package com.example.myapp.ui.materials

import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.ui.theme.BackGroundColorTheme
import com.example.myapp.ui.ui.theme.BackGroundColorTheme1
import com.example.myapp.ui.ui.theme.MyAppTheme
import com.example.myapp.ui.ui.theme.Neutral94
import rememberHome

@Composable
fun bottomBar() {
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFFccf0fb),
                shape = RoundedCornerShape(50, 50, 0, 0)
            )
            .height(80.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .background(BackGroundColorTheme1,shape = RoundedCornerShape(50, 0, 0, 0))
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = rememberHome(),
                contentDescription = null,


                )
        }
        Box(
            Modifier
                .background(BackGroundColorTheme,shape = RoundedCornerShape(0, 0, 0, 0))
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = rememberHeartPlus(),
                contentDescription = null,


                )
        }
        Box(
            Modifier
                .background(BackGroundColorTheme,shape = RoundedCornerShape(0, 50, 0, 0))
                .weight(1f)
                .fillMaxHeight(),
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
        bottomBar()
    }
}