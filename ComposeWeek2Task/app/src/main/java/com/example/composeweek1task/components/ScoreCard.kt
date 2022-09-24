package com.example.composeweek1task.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ScoreCard(title:String,subtitle:String){
    Column() {
        TextWidget(txt = title, clr = Color.Black, fontSize = 16.0)
        TextWidget(txt = subtitle, clr = Color.Black, fontSize = 32.0,weight = FontWeight.SemiBold)
    }
}