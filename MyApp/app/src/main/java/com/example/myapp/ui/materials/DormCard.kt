package com.example.myapp.ui.materials

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.myapp.MainActivity
import com.example.myapp.ui.ui.theme.BackGroundColorTheme
import com.example.myapp.ui.ui.theme.MyAppTheme

@Composable
fun dormCard(
    headline: String = "Headling",
    location: String = "Location",
    Price: String = "6500 - 21000",
    tel: String = "090697XXXX"
) {
    val context = LocalContext.current
    OutlinedCard(modifier = Modifier
        .height(124.dp)
        .fillMaxWidth()
        .background(color = BackGroundColorTheme)
        .padding(5.dp)
        .clickable {
            context.startActivity(Intent(context, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }
        .shadow(
            elevation = 25.dp,
            ambientColor = Color.Blue,
            spotColor = Color.Cyan,
        ),
        border = BorderStroke(1.dp, Color.Black),

        ) {
        Row(
            modifier = Modifier
                .padding(0.dp, 8.dp, 0.dp, 8.dp)
                .fillMaxWidth()
        ){
            Box(modifier = Modifier.width(120.dp).height(120.dp).padding(8.dp)) {
                val painter = rememberImagePainter(
                    data = "https://static.vecteezy.com/system/resources/thumbnails/025/220/125/small_2x/picture-a-captivating-scene-of-a-tranquil-lake-at-sunset-ai-generative-photo.jpg",
                    builder = {
                    }
                )
                val painterState = painter.state
                Image(painter = painter, contentDescription = null)
            }
            Column {
                Text(text = headline, maxLines = 1)

                Row {
                    Image(
                        modifier = Modifier.padding(),
                        imageVector = rememberLocationCity(defaultHeight = 21.dp, defaultWidth = 21.dp),
                        contentDescription = null,
                    )
                    Text(text = location, maxLines = 1)

                }
                Row {
                    Image(
                        modifier = Modifier.padding(),
                        imageVector = rememberPriceChange(defaultHeight = 21.dp, defaultWidth = 21.dp),
                        contentDescription = null,
                    )
                    Text(text = "$Price baht/month", maxLines = 1)

                }
                Row {
                    Image(
                        modifier = Modifier.padding(),
                        imageVector = rememberSmartphone(defaultHeight = 21.dp, defaultWidth = 21.dp),
                        contentDescription = null,
                    )
                    Text(text = tel, maxLines = 1)
                }
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