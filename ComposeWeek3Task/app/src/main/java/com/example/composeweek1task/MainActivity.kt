package com.example.composeweek1task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeweek1task.datasource.DataSource
import com.example.composeweek1task.model.Restaurant
import com.example.composeweek1task.ui.theme.ComposeWeek3TaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWeek3TaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainApp()
                }
            }
        }
    }
}
@Composable
fun MainApp(){
    ComposeWeek3TaskTheme() {
        RestaurantList(restaulist = DataSource().loadData(), modifier =Modifier )
    }
}
@Composable
fun RestaurantCard(restau:Restaurant, modifier: Modifier) {
    Card(modifier = Modifier.padding(8.dp), elevation = 10.dp, shape = RoundedCornerShape(15.dp)) {


        Column() {
            Image(painter = painterResource(id = restau.imageResourceId), contentDescription = stringResource(
                id = restau.stringResourceId) , modifier = Modifier
                .fillMaxWidth()
                .height(192.dp), contentScale = ContentScale.Crop)
            Row {
                Column(modifier=Modifier.padding(vertical = 5.dp)) {
                    Text(
                        text = stringResource(id = restau.stringResourceId),
                        modifier = Modifier.padding(horizontal = 8.dp),
                        style = MaterialTheme.typography.h6
                    )

                    Text(
                        text = stringResource(id = restau.string2ResourceId),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Column() {
                    Row(modifier = Modifier
                        .padding(top = 5.dp, start = 50.dp)
                        .background(color = Color.Cyan, shape = RoundedCornerShape(5.dp))) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color.Yellow,
                            modifier = Modifier.padding(start = 0.dp)
                        )
                        Text(text = stringResource(id = restau.string3ResourceId)+"  ")

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "₹"+restau.price.toString()+" for one",modifier = Modifier.padding(start = 50.dp))

                }
            }
        }}
}
@Composable
fun icon(){
    Icon(imageVector = Icons.Default.Search , contentDescription =null )
}
@Composable
private fun RestaurantList(restaulist:List<Restaurant>,modifier: Modifier){
    Column{
        var values by remember {
            mutableStateOf("Restaurant name or a dish")
        }
        Surface(elevation = 20.dp) {
            TextField( value = values, onValueChange ={ newValue->values=newValue}, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 18.dp),
                shape = RoundedCornerShape(22.dp))

        }

        LazyColumn{

            items(restaulist){
                    restaurant->
                RestaurantCard(restau = restaurant, modifier =modifier )
            }

        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeWeek3TaskTheme {
        RestaurantCard(restau = Restaurant(R.string.hotel2,R.drawable.image1,R.string.h2desc,R.string.Rating1,440),modifier=Modifier)
    }
}