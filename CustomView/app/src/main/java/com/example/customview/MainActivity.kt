package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cusView = binding.squareView

        binding.buttonTop.setOnClickListener {
            cusView.moveTop()
        }
        binding.buttonBot.setOnClickListener {
            cusView.moveBot()
        }
        binding.buttonLeft.setOnClickListener {
            cusView.moveLeft()
        }
        binding.buttonRight.setOnClickListener {
            cusView.moveRight()
        }
    }
}