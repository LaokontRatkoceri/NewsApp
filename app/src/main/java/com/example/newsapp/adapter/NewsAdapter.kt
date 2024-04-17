package com.example.newsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.model.News
import com.squareup.picasso.Picasso

class NewsAdapter(val list: List<News>,  val onClick:(News) -> Unit) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image_profiler = view.findViewById<ImageView>(R.id.Image_Profile)
        val Title_TextView = view.findViewById<TextView>(R.id.Title_TextView)
        val Writer_textview = view.findViewById<TextView>(R.id.Writer_textview)
        val LanguageFlag = view.findViewById<TextView>(R.id.LanguageFlag)
        val datePublished = view.findViewById<TextView>(R.id.Date_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        val imageURL = list[position].imageProfile


        holder.Writer_textview.text = item.source.toString()
        holder.Title_TextView.text = item.news.toString()
        //holder.image_profiler.text = item.imageProfile.toString()
        Picasso.get().load(imageURL).into(holder.image_profiler)

        holder.Writer_textview.text = item.source.toString()
        holder.LanguageFlag.text = item.imageNational.toString()
        holder.datePublished.text = item.newsPublished.toString()

        holder.itemView.setOnClickListener{
            onClick(list[position])
        }

    }

    override fun getItemCount(): Int = list.size
}