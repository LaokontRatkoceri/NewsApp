package com.example.newsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class BindingAdapters(val imageList: List<String>) : RecyclerView.Adapter<BindingAdapters.ViewHolder>(){
    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.Item_ImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingAdapters.ViewHolder {
        val pager2 = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(pager2)
    }

    override fun getItemCount(): Int = imageList.size

    override fun onBindViewHolder(holder: BindingAdapters.ViewHolder, position: Int) {
        val imageURL = imageList[position]
        Picasso.get().load(imageURL).into(holder.image)

    }
}