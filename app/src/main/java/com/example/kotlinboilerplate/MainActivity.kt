package com.example.kotlinboilerplate

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinboilerplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Inflate view binding layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup button click listener
        binding.btnClickMe.setOnClickListener {
            binding.tvWelcome.text = "Hello, Kotlin Android Developer!"
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
