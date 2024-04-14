package com.example.learncompose.ui.compose.instagramui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learncompose.R

@Composable
fun ProfileScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Column(){
            TopBar()
        }
    }

}

@Composable
fun TopBar(
){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
        .fillMaxWidth()) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_back),
            contentDescription ="Return",
            Modifier.size(30.dp)
        )
        
        Text(
            text = "philipplacker_official",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        
        Icon(painter = painterResource(id = R.drawable.ic_notifications),
            contentDescription = "Notification",
            Modifier.size(30.dp)
        )

        Icon(painter = painterResource(id = R.drawable.ic_more),
            contentDescription = "Notification",
            Modifier.size(30.dp)
        )

    }

}