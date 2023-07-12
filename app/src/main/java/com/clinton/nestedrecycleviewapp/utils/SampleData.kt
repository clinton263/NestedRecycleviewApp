package com.clinton.nestedrecycleviewapp.utils

import com.clinton.nestedrecycleviewapp.model.MainModel
import com.clinton.nestedrecycleviewapp.model.MovieModel

object SampleData {

    private val movieModel= listOf(
        MovieModel(Image.imageUrl0),
        MovieModel(Image.imageUrl1),
        MovieModel(Image.imageUrl2),
        MovieModel(Image.imageUrl3),
        MovieModel(Image.imageUrl4),
        MovieModel(Image.imageUrl5),
        MovieModel(Image.imageUrl6),
        MovieModel(Image.imageUrl7),
        MovieModel(Image.imageUrl8),
        MovieModel(Image.imageUrl9)

    )
    val collections = listOf(
        MainModel("All Movie" , movieModel),
        MainModel("Want to see" , movieModel.reversed()),
        MainModel("Popular Movie" , movieModel.shuffled()),
        MainModel("Top Rated Movie" , movieModel)

    )
}