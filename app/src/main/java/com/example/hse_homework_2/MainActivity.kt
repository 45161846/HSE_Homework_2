package com.example.hse_homework_2

import android.net.ConnectivityManager
import android.os.Bundle
import android.telecom.ConnectionService
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import coil3.Bitmap
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.compose.SubcomposeAsyncImage
import coil3.compose.SubcomposeAsyncImageContent
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.hse_homework_2.ui.theme.HSE_Homework_2Theme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val serv: ConnectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager



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

const val url = "https://raw.githubusercontent.com/45161846/HSE_Homework_2/refs/heads/master/HOOOOOOOOG.png"

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