package com.example.newsapp.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.R
import com.example.newsapp.adapter.BindingAdapters
import com.example.newsapp.constant.API_DESC
import com.example.newsapp.constant.API_NEWS
import com.example.newsapp.constant.API_SOURCE


class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_open)
        val NewsViewPager = findViewById<ViewPager2>(R.id.Image2)

        val TitleText = findViewById<TextView>(R.id.Title2)
        val SourceText = findViewById<TextView>(R.id.Source_textView)
        val DesText = findViewById<TextView>(R.id.second_ImageView)


        val Title = intent.extras?.getString(API_NEWS)
        val Desc = intent.extras?.getString(API_DESC)
        val Source = intent.extras?.getString(API_SOURCE)

        TitleText.text = Title
        SourceText.text = Source
        DesText.text = Desc


        NewsViewPager.adapter = BindingAdapters(createImage())
    }
    fun createImage() = listOf(
        getString(R.string.ImageUrl),
        getString(R.string.ImageUrl1),
        getString(R.string.ImageUrl2),
        getString(R.string.ImageUrl3),
        getString(R.string.ImageUrl4)
    )

}