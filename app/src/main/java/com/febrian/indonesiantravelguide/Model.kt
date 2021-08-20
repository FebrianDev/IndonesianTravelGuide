package com.febrian.indonesiantravelguide

data class Model(
    val name : String? = null,
    val description : String? = null,
    val address: String? = null,
    val website : String? = null,
    val tag : ArrayList<String>? = null,
    val images : ArrayList<Int>? = null
)
