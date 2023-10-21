package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.foodhub.R


class Sign_Up : AppCompatActivity() {

    lateinit var SignIn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        SignIn=findViewById(R.id.SignIn)

        goToLoginFromSignUp()

    }

    fun goToLoginFromSignUp()
    {
        SignIn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Login::class.java))
        })
    }
}