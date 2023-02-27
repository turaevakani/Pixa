package com.geektech.pixa

data class PixaModel(
    var hits: java.util.ArrayList<Hit>
)

data class Hit(
    val largeImageURL: String
)