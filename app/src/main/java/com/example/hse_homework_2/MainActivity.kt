package com.example.hse_homework_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.hse_homework_2.ui.theme.HSE_Homework_2Theme
import com.example.hse_homework_2.wrappers.ScreenState

class MainActivity : ComponentActivity() {

    private val viewmodel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HSE_Homework_2Theme {
                val state = viewmodel.screenState.collectAsState()
                MainScreen(state.value)
            }
        }
    }
}

@Composable
fun MainScreen(state: ScreenState) {
    AsyncImage(
        model = "",
        contentDescription = null
    )
}
