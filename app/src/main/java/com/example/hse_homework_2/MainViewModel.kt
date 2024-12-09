package com.example.hse_homework_2

import androidx.lifecycle.ViewModel
import com.example.hse_homework_2.wrappers.ScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {

    private val url = ""

    private val _screenState: MutableStateFlow<ScreenState> = MutableStateFlow(ScreenState.Loading)
    val screenState: StateFlow<ScreenState> = _screenState

    init {

    }

}