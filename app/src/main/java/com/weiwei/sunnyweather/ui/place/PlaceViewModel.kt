package com.weiwei.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.weiwei.sunnyweather.logic.Repository
import com.weiwei.sunnyweather.logic.model.Place

class PlaceViewModel: ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData){ query->
        Repository.researchPlaces(query)
    }
    fun searchPlaces(query:String){
        searchLiveData.value = query
    }
}