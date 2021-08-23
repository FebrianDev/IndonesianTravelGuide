package com.febrian.indonesiantravelguide

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Model(
    val name : String? = null,
    val description : String? = null,
    val address: String? = null,
    val website : String? = null,
    val tag : String? = null,
    val images : ArrayList<Int>? = null
) : Parcelable
