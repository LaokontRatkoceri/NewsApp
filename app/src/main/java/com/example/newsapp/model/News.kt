package com.example.newsapp.model

import java.util.Date

data class News(
    var source: String,
    var news: String,
    var newsDescription: String,
    var newsPublished : String,
    val imageProfile: String,
    val imageNational: String,
)