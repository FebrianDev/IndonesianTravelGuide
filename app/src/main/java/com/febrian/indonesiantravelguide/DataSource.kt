package com.febrian.indonesiantravelguide

import androidx.lifecycle.LiveData

interface DataSource {
    fun getData() : LiveData<ArrayList<Model>>
}