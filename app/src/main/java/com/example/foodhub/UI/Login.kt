package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.foodhub.R


class Login : AppCompatActivity() {
    lateinit var back_arrow :Button
    lateinit var SignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        back_arrow=findViewById(R.id.back_arrow)
        SignUp=findViewById(R.id.SignUp)
        back_arrow.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,welcome::class.java))
        })


        SignUp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Sign_Up
            ::class.java))

        })

    }
}