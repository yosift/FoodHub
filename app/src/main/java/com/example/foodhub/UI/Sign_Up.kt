package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodhub.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class Sign_Up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



        goToLoginFromSignUp()

    }

    fun goToLoginFromSignUp()
    {
        SignIn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Login::class.java))
        })
    }
}