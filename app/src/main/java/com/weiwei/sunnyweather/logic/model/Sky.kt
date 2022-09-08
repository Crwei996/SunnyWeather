package com.weiwei.sunnyweather.logic.model

import com.weiwei.sunnyweather.R

class Sky(val info:String,val icon:Int,val bg:Int)
private val sky = mapOf(
    "CLEAR_DAY" to Sky("晴", R.drawable.one_background, R.drawable.img),
    "CLEAR_NIGHT" to Sky("晴", R.drawable.one_background,  R.drawable.img),

    "PARTLY_CLOUDY_DAY" to Sky("多云", R.drawable.one_background, R.drawable.img),

    "PARTLY_CLOUDY_NIGHT" to Sky("多云", R.drawable.one_background,  R.drawable.img),

    "CLOUDY" to Sky("阴", R.drawable.one_background,  R.drawable.img),

    "WINDY" to Sky("大风", R.drawable.one_background,  R.drawable.img),

    "LIGHT_RAIN" to Sky("小雨", R.drawable.one_background,  R.drawable.img),

    "MODERATE_RAIN" to Sky("中雨", R.drawable.one_background,  R.drawable.img),

    "HEAVY_RAIN" to Sky("大雨", R.drawable.one_background,  R.drawable.img),
    "STORM_RAIN" to Sky("暴雨", R.drawable.one_background,  R.drawable.img),
    "THUNDER_SHOWER" to Sky("雷阵雨", R.drawable.one_background, R.drawable.img),
    "SLEET" to Sky("雨夹雪", R.drawable.one_background,  R.drawable.img),
    "LIGHT_SHOW" to Sky("小雪", R.drawable.one_background,  R.drawable.img),
    "MODERATE_SNOW" to Sky("中雪", R.drawable.one_background,  R.drawable.img),
    "HEAVY_SNOW" to Sky("大雪", R.drawable.one_background,  R.drawable.img),
    "STORM_SNOW" to Sky("暴雪", R.drawable.one_background, R.drawable.img),
    "HAIL" to Sky("冰雹", R.drawable.one_background, R.drawable.img),
    "LIGHT_HAZE" to Sky("轻度雾霾", R.drawable.one_background, R.drawable.img),
    "MODERATE_HAZE" to Sky("重度雾霾", R.drawable.one_background,  R.drawable.img),
    "HEAVY_HAZE" to Sky("重度雾霾", R.drawable.one_background,  R.drawable.img),
    "FOG" to Sky("雾", R.drawable.one_background,  R.drawable.img),
    "DUST" to Sky("浮尘", R.drawable.one_background,  R.drawable.img)

    )
fun getSky(skycon:String):Sky{
    return sky[skycon] ?:sky["CLEAR_DAY"]!!
}
