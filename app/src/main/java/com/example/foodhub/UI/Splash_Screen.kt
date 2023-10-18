package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodhub.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        mylogo.animate().alpha(1f).setDuration(3000)

        var intent=Intent(this, welcome::class.java)
        setdelay(1000,intent)


    }
    fun setdelay(ms:Int,i:Intent)
    {
        android.os.Handler().postDelayed({
            startActivity(i)
        }, 3000)
    }
}