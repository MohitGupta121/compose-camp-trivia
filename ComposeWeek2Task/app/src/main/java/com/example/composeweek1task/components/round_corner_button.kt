package com.example.composeweek1task.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundCornerButton(title: String){
    Box(
        modifier = Modifier
            .padding(horizontal = 5.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable {
                //do something
            }
            .height(100.dp)
            .width(100.dp)
            .background(color = Color(0XFF6E00F8),),
        contentAlignment= Alignment.Center

    ) {
        Text(
            text = title,
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp),
            color = Color.White,
        )
    }

}