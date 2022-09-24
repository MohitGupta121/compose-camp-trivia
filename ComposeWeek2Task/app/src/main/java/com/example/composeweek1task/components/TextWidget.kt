package com.example.composeweek1task.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextWidget(txt:String, clr: Color, fontSize:Double, weight: FontWeight = FontWeight.Normal, fontFamily: FontFamily?=null){
    Text(txt,

        style = TextStyle(
            color = clr,
            fontSize = fontSize.sp,
            fontWeight = weight,
            fontFamily = fontFamily
        )
    )

}