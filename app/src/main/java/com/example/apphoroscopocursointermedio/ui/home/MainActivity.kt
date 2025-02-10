package com.example.apphoroscopocursointermedio.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apphoroscopocursointermedio.R
import com.example.apphoroscopocursointermedio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Configuration of the view binding in the activity
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Configuration of the view binding in the activity
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}