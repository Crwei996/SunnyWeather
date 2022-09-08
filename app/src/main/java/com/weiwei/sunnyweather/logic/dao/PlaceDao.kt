package com.weiwei.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.weiwei.sunnyweather.SunnyWeatherApplication
import com.weiwei.sunnyweather.logic.model.Place

object PlaceDao {
    fun savePlace(place: Place){
        sharePreferences().edit(){
            putString("place", Gson().toJson(place))
        }
    }
    fun getSavedPlace():Place{
        val placeJson = sharePreferences().getString("place","");
        return Gson().fromJson(placeJson,Place::class.java)
    }
    fun isPlaceSaved() = sharePreferences().contains("place")

    private fun sharePreferences() = SunnyWeatherApplication.context.getSharedPreferences("sunny_weather",Context.MODE_PRIVATE);
}