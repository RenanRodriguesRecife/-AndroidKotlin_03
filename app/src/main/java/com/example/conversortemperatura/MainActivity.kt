package com.example.conversortemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversortemperatura.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val celsius = binding.editText.text.toString().toDouble()

            val fahrenheit = celsius * 1.8 + 32

            binding.test.text = "$fahrenheit °F"
        }
    }
}