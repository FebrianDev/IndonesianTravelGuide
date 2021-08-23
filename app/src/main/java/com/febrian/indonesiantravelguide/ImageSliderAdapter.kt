package com.febrian.indonesiantravelguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter

class ImageSliderAdapter(private val listImages: ArrayList<Int>?) : SliderViewAdapter<ImageSliderAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View?) : SliderViewAdapter.ViewHolder(itemView) {
        fun bind(s : Int){
            Glide.with(itemView).load(s).into(itemView.findViewById(R.id.iv_auto_image_slider))
        }
    }

    override fun getCount(): Int {
        return listImages!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): ImageSliderAdapter.ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.image_slider_layout_item, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ImageSliderAdapter.ViewHolder?, position: Int) {
        viewHolder?.bind(listImages!![position])
    }
}