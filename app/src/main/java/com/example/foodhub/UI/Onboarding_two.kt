package com.example.foodhub.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.foodhub.R


class onboarding_two : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_onboarding_two, container, false)

        var viewer_page=activity?.findViewById<ViewPager>(R.id.viewpager)
        var next_two=view.findViewById<Button>(R.id.next_two)

        next_two.setOnClickListener(View.OnClickListener {
            viewer_page?.currentItem=2
        })


        return view
    }


}