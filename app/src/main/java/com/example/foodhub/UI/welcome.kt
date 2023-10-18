package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodhub.R
import kotlinx.android.synthetic.main.activity_welcome.*

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        goToSigUp()
        goToOnboarding()
        goToSignIn()

    }

    fun goToSigUp()
    {
        start_with_emailorphone.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Sign_Up::class.java))
        })
    }
    fun goToOnboarding()
    {
        skip_btn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Onboarding::class.java))
        })

    }

    fun goToSignIn()
    {
        SignIn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,Login::class.java))
        })
    }

}