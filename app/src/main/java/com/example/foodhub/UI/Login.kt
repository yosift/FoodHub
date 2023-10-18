package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodhub.R
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        back_arrow.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,welcome::class.java))
        })


        SignUp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Sign_Up
            ::class.java))

        })

    }
}