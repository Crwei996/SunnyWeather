package com.weiwei.sunnyweather.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.weiwei.sunnyweather.R
import com.weiwei.sunnyweather.logic.model.Place

class PlaceAdapter(private var fragment:Fragment,private var placeList:List<Place>):RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {


    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val placeName:TextView = view.findViewById(R.id.placeName)
        val placeAddress:TextView = view.findViewById(R.id.placeAddress)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.place_item,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        var place = placeList[position]
        holder.placeName.text = place.name
        holder.placeAddress.text = place.address
    }

    override fun getItemCount() = placeList.size

}