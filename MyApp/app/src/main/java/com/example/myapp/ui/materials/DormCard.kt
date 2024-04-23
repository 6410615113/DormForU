package com.example.myapp.ui.materials

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapp.ui.ui.theme.MyAppTheme

@Composable
fun dormCard() {
    Box(modifier = Modifier
        .height(88.dp)
        .fillMaxWidth()
        .background(color = Color.Blue)
        ) {
        Row(
            modifier = Modifier
                .padding(0.dp, 12.dp, 0.dp, 12.dp)
                .background(color = Color.Green)
        ){
            Box(modifier = Modifier
                .height(128.dp)
                .width(106.dp)
                .padding(0.dp, 0.dp, 16.dp, 0.dp) ){}
            Column {
                Text(text = "Headline")
                Text(text = "Location")
                Text(text = "Price")
                Text(text = "Tel")
            }
        }
    }
}
@Preview
@Composable
fun dormCardPreview() {
    MyAppTheme {
        dormCard()
    }
}