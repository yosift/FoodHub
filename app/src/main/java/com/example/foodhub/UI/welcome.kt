package com.example.foodhub.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.foodhub.R


class welcome : AppCompatActivity() {
    lateinit var start_with_emailorphone:Button
    lateinit var skip_btn:Button
    lateinit var SignIn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        start_with_emailorphone=findViewById(R.id.start_with_emailorphone)
        skip_btn=findViewById(R.id.skip_btn)
        SignIn=findViewById(R.id.SignIn)



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