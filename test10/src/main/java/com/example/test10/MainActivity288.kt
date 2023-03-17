package com.example.test10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.test10.databinding.ActivityMain288Binding
import com.example.test10.databinding.DialogInputBinding

class MainActivity288 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain288Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //DialogInputBinding 사용자가 직접 정의한 xml 파일을 바인딩 했음.
            val dialogBinding = DialogInputBinding.inflate(layoutInflater)

            AlertDialog.Builder(this).run {
                setTitle("Input")
                setView(dialogBinding.root)
                dialogBinding.edit1.setOnClickListener {
                    Log.d("song", "에디터 뷰 선택 한번 해봄.")
                    Toast.makeText(this@MainActivity288,"토스트연습", Toast.LENGTH_SHORT)
                }
                /*dialogBinding.edit1.setOnClickListner {

                }*/
                setPositiveButton("닫기", null)
                show()
            }
        }
    }
}