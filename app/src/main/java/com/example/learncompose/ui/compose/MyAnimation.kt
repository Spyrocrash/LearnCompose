package com.example.learncompose.ui.compose

import android.graphics.Color
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind

class MyAnimation {
    /*@Composable
    fun changeColor(
        initialColor: androidx.compose.ui.graphics.Color,
        targetColor: androidx.compose.ui.graphics.Color,
        modifier: Modifier
    )
    *//*{

        var animateBackgroundColor by remember {
            mutableStateOf(true)
        }
        LaunchedEffect(Unit) {
            animateBackgroundColor = true
        }

        val animatedColor by animateColorAsState(
            if (animateBackgroundColor) initialColor
            else targetColor,
            label = "color"

        Box(
            modifier = Modifier

        )


    }*//* {
        var animateBackgroundColor by remember {
            mutableStateOf(true)
        }
        LaunchedEffect(Unit) {
            animateBackgroundColor = true
        }
        // [START android_compose_animate_background_color]
        val animatedColor by animateColorAsState(
            if (animateBackgroundColor) colorGreen else colorBlue,
            label = "color"
        )
        Column(
            modifier = Modifier.drawBehind {
                drawRect(animatedColor)
            }
        ) {
            // your composable here
        }
    }*/
}