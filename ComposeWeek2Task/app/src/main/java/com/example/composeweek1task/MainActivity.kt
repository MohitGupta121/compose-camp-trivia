package com.example.composeweek1task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composeweek1task.components.RoundCornerButton
import com.example.composeweek1task.components.ScoreCard
import com.example.composeweek1task.components.TextWidget

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
                Main()
        }
    }
}

@Composable
fun Main() {
    Scaffold(
        backgroundColor = Color.White,
        topBar = {
            Image(painter = painterResource(id = R.drawable.banner), contentDescription = "Jetpack Icon", modifier = Modifier.fillMaxWidth())
        },
        content={
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize(),
            )
            {
                TextWidget(txt = "Score", clr = Color.Black, fontSize = 30.0)
                TextWidget(txt = "0/4", clr = Color.Black, fontSize = 50.0, weight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(100.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    ScoreCard(title="You chose",subtitle="Rock")
                    ScoreCard(title="Android chose",subtitle="Paper")
                }
                Spacer(modifier = Modifier.height(100.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    RoundCornerButton("Rock")
                    RoundCornerButton("Paper")
                    RoundCornerButton("Scissors")
                }
                Spacer(modifier = Modifier.height(50.dp))
                TextWidget(txt = "#JetpackCompose", clr =Color.Black , fontSize =20.0,
                    fontFamily = FontFamily.SansSerif,
                )

            }
        }
    )
}