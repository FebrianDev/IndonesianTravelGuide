package com.febrian.indonesiantravelguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TravelViewModel : ViewModel() {
    fun getData(): LiveData<ArrayList<Model>> {
        val data: MutableLiveData<ArrayList<Model>> = MutableLiveData<ArrayList<Model>>()
        data.postValue(ListDataStatic().getData())
        return data
    }
}