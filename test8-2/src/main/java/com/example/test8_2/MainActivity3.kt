package com.example.test8_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import com.example.test8_2.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    open class MyEventHandler : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
            Log.d("song", "체크박스 클릭")
        }

    }

    // 2번째 방법의 인터페이스 구현시 재정의 하는 함수
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        Log.d("song", "체크박스 클릭")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        var state: Int = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.image.setOnClickListener {
            if (state == 0) {
                binding.image.visibility = View.INVISIBLE
                state = 1
            } else {
                binding.image.visibility = View.VISIBLE
                state = 0
            }
        }

        //3번째 sam 기법 (single abstract method)
        binding.checkbox.setOnLongClickListener {
            if (state == 0) {
                binding.button.visibility = View.INVISIBLE
                state = 1
            } else {
                binding.button.visibility = View.VISIBLE
                state = 0
            }
            true

            //2번째 방법
            //    binding.checkbox.setOnCheckedChangeListener(this)

//        val test = MyEventHandler()
//        test.onCheckedChanged(binding.checkbox, true)
//
//        binding.checkbox.setOnClickListener {
//            test.onCheckedChanged(binding.checkbox, true)
//        }
            //1번째 방법
            //    binding.checkbox.setOnCheckedChangeListener(MyEventHandler())


        }
    }
}
