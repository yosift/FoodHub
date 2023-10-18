package com.example.foodhub.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.foodhub.Adapter.ViewAdapter
import com.example.foodhub.R
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_onboarding.*
import java.lang.Exception

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

    val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
    val viewPager = findViewById<ViewPager>(R.id.viewpager)
    val adapter = ViewAdapter(supportFragmentManager)
    viewPager.adapter = adapter
    dotsIndicator.setViewPager(viewPager)



    }
}