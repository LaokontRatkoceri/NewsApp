package com.example.newsapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.constant.API_DESC
import com.example.newsapp.constant.API_IMAGEN
import com.example.newsapp.constant.API_IMAGEP
import com.example.newsapp.constant.API_NEWS
import com.example.newsapp.constant.API_PUBLISHED
import com.example.newsapp.constant.API_SOURCE
import com.example.newsapp.model.News

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NewsRecycler = findViewById<RecyclerView>(R.id.recycle_news)

        val adapter = NewsAdapter(getContacts(), this::onContactClick)

        NewsRecycler.layoutManager = LinearLayoutManager(this)
        NewsRecycler.adapter = adapter
    }
    private fun onContactClick(news: News){
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(API_SOURCE, news.source)
        intent.putExtra(API_NEWS, news.news)
        intent.putExtra(API_DESC, news.newsDescription)
        intent.putExtra(API_PUBLISHED, news.newsPublished)
        intent.putExtra(API_IMAGEP, news.imageProfile)
        intent.putExtra(API_IMAGEN, news.imageNational)
        startActivity(intent)
    }
    private fun getContacts(): List<News>{
        return listOf(
            News( "Maze",  "Maze Bulmeti", "saaaaddddddd","Jesse Waters", "https://atlas-content-cdn.pixelsquid.com/assets_v2/191/1912564081961735300/previews/G03-200x200.jpg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/800px-Flag_of_Albania.svg.png"),
            News( "Maze",  "Maze Bulmeti", "saaaaddddddd","Jesse Waters", "https://atlas-content-cdn.pixelsquid.com/assets_v2/191/1912564081961735300/previews/G03-200x200.jpg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/800px-Flag_of_Albania.svg.png"),
            News( "Maze",  "Maze Bulmeti", "saaaaddddddd","Jesse Waters", "https://atlas-content-cdn.pixelsquid.com/assets_v2/191/1912564081961735300/previews/G03-200x200.jpg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/800px-Flag_of_Albania.svg.png"),
            News( "Maze",  "Maze Bulmeti", "saaaaddddddd","Jesse Waters", "https://atlas-content-cdn.pixelsquid.com/assets_v2/191/1912564081961735300/previews/G03-200x200.jpg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/800px-Flag_of_Albania.svg.png"),
            News( "Maze",  "Maze Bulmeti", "saaaaddddddd","Jesse Waters", "https://atlas-content-cdn.pixelsquid.com/assets_v2/191/1912564081961735300/previews/G03-200x200.jpg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/800px-Flag_of_Albania.svg.png"),

        )
    }
}