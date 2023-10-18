package com.example.foodhub.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.foodhub.UI.onboarding_one
import com.example.foodhub.UI.onboarding_three
import com.example.foodhub.UI.onboarding_two

class ViewAdapter(frm:FragmentManager):FragmentPagerAdapter(frm) {
    var fragment= arrayListOf(onboarding_one(), onboarding_two(), onboarding_three())
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }
}