package com.example.hse_homework_2.wrappers

import android.graphics.Bitmap

sealed class ScreenState{

    data object Loading: ScreenState()

    data class ImageQR(
        val image: Bitmap,
        val qrcode: Bitmap
    ): ScreenState()

}