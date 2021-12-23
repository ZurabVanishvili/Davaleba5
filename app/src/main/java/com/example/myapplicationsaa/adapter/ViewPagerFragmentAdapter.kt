package com.example.myapplicationsaa.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplicationsaa.fragmm.Fragment3
import com.example.myapplicationsaa.fragmm.Fragment1
import com.example.myapplicationsaa.fragmm.Fragment2

class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else ->Fragment1()

        }

    }


}