package com.example.learncompose.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class LearnState {

    @Composable
    fun ColorBox(
        modifier: Modifier = Modifier,
    ) {
        var color by remember { mutableStateOf(Color.Yellow) }
        Box(
            modifier = modifier
                .background(color)
                .clickable {
                    color = Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                }
        )


    }

    @Composable
    fun ColorBoxAnotherBox(
        modifier: Modifier = Modifier,
        updateColor: (Color) -> Unit
    ){
        Box(
            modifier = modifier
                .clickable {
                    updateColor(Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                ))  }
        ) {

        }


    }
}