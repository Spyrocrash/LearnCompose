package com.example.learncompose.ui.compose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TestTextStyling {


    @Composable
    fun testSimpleText(text: String){
        Text(
            text = text,
            color = Color.Blue,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline

        )
    }

    @Composable
    fun testAnnotatedString(){
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = 22.sp,
                        color = Color.DarkGray
                    )
                ) {
                    append("H")
                }
                append("ello ")
                withStyle(
                    style = SpanStyle(
                        fontSize = 22.sp,
                        color = androidx.compose.ui.graphics.Color.DarkGray
                    )
                ) {
                    append("W")
                }
                append("orld ")
            },
            color = Color.Magenta,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold


        )

    }
}