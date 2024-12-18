package com.example.hse_homework_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.example.hse_homework_2.ui.theme.HSE_Homework_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HSE_Homework_2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    ImageScreen()
                }
            }
        }
    }
}

const val url =
    "https://raw.githubusercontent.com/45161846/HSE_Homework_2/refs/heads/master/HOOOOOOOOG.png"

@Composable
fun ImageScreen() {

    AsyncImage(
        placeholder = painterResource(R.drawable.hog),
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .build(),
        contentDescription = "",
        error = painterResource(R.drawable.hog)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HSE_Homework_2Theme {
        ImageScreen()
    }
}