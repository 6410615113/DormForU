package com.example.myapp.ui.materials

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.ui.theme.BackGroundColorTheme1
import com.example.myapp.ui.ui.theme.IconColor
import com.example.myapp.ui.ui.theme.MyAppTheme

@Composable
fun topBar(){
    Box(
        modifier = Modifier
            .background(
                color = BackGroundColorTheme1,
                shape = RoundedCornerShape(0, 0, 50, 50)
            )
            .height(80.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Hello, World", color = IconColor)
    }
}
@Preview(showBackground = true)
@Composable
fun topBarPreview() {
    MyAppTheme {
        topBar()
    }
}