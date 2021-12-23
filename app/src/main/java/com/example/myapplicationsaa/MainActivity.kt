package com.example.myapplicationsaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplicationsaa.adapter.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tablayout : TabLayout
    private lateinit var viewpager2 : ViewPager2
    private lateinit var viewpagerfragmentadapter : ViewPagerFragmentAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        viewpager2.adapter = viewpagerfragmentadapter
        TabLayoutMediator(tablayout , viewpager2){tab , position ->
            tab.text = "tab ${position+1}"
        }.attach()

    }
    private fun init(){
        tablayout = findViewById(R.id.tablayout1)
        viewpager2 = findViewById(R.id.viewpagerr2)
        viewpagerfragmentadapter = ViewPagerFragmentAdapter(this)





    }
}