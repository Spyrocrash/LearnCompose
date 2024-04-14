package com.example.learncompose.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MyImage{

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        //modifier: Modifier = Modifier,
    ) {
        Card(
            Modifier.padding(8.dp).height(200.dp).fillMaxWidth(0.5f),
            shape = RoundedCornerShape(10.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.Transparent, Color.Black),
                                startY = 300f
                            )
                        )
                )

                    Text(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(6.dp),
                        text = title,
                        fontSize = 16.sp,
                        color = Color.White
                    )


            }
        }

    }

    /*@Preview
    @Composable
    fun TestImageCard(
        //painter: Painter ,
        contentDescription: String = "Some beautiful image",
        title: String = "Beautiful image",
    ){
        Card(
            Modifier.height(200.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.Transparent, Color.Black),
                                startY = 300f
                            )
                        )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }

            }
        }*/
}