package com.example.test11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.test11.databinding.ActivityMain354Binding
import com.example.test11.databinding.ActivityMain355Binding
import com.example.test11.databinding.Item354Binding

class MainActivity355 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main354)

        val binding= ActivityMain355Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val datas = mutableListOf<String>()
        for(i in 1..3){
            datas.add("Item $i")
        }
        val adapter= MyFragmentPagerAdapter(this)
        binding.viewpager.adapter = adapter
    }

    // 어댑터 프래그먼트를 이용한 방식.
    class MyFragmentPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity){
        val fragments: List<Fragment>
        init {
            fragments= listOf(OneFragment(), TwoFragment(), ThreeFragment())
            Log.d("song" ,"fragments size : ${fragments.size}")
        }
        override fun getItemCount(): Int = fragments.size

        override fun createFragment(position: Int): Fragment = fragments[position]
    }
}