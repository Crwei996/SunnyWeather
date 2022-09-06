package com.weiwei.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    //全局获得Context
    companion object{
        const val TOKEN = "Nda623e5IwvLJYQa"//彩云天气令牌
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context =applicationContext
    }
}