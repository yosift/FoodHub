package com.example.foodhub.UI

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodhub.R
import kotlinx.android.synthetic.main.fragment_onboarding_three.view.*

class onboarding_three : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        var view= inflater.inflate(R.layout.fragment_onboarding_three, container, false)

        view.next_third.setOnClickListener(View.OnClickListener {
            view.context.startActivity(Intent(context, Sign_Up::class.java))
        })





        return view
    }


}