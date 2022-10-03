package com.example.composeweek1task.datasource

import com.example.composeweek1task.R
import com.example.composeweek1task.model.Restaurant

class DataSource {

    fun loadData():List<Restaurant>{
        return listOf<Restaurant>(
            Restaurant(R.string.hotel1,R.drawable.image1,R.string.h1desc,R.string.Rating1,240),
            Restaurant(R.string.hotel2,R.drawable.image2,R.string.h2desc,R.string.Rating2,350),
            Restaurant(R.string.hotel3,R.drawable.image3,R.string.h3desc,R.string.Rating3,640),
            Restaurant(R.string.hotel4,R.drawable.image4,R.string.h4desc,R.string.Rating5,740)

        )
    }
}