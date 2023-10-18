package com.example.foodhub.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.foodhub.R
import kotlinx.android.synthetic.main.fragment_onboarding_one.view.*

class onboarding_one : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_onboarding_one, container, false)
        var viewer_page=activity?.findViewById<ViewPager>(R.id.viewpager)

        view.next_one.setOnClickListener(View.OnClickListener {
            viewer_page?.currentItem=1
        })


    return view
    }




}