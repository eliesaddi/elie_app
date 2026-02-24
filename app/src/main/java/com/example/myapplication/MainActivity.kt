package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val newsList = listOf(
            News("Android 15 Released", "Google releases Android 15 with new features.", R.mipmap.ic_launcher),
            News("AI Revolution", "Artificial Intelligence is transforming the world.", R.mipmap.ic_launcher),
            News("SpaceX Launch", "SpaceX successfully launches new rocket.", R.mipmap.ic_launcher),
            News("New Tech Trends", "Top technology trends of 2026.", R.mipmap.ic_launcher),
            News("Cybersecurity Alert", "New security risks discovered online.", R.mipmap.ic_launcher)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )


    }
}