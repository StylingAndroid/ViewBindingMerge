package com.stylingandroid.viewbindingmerge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingmerge.databinding.ActivityIgnoreBinding

class IgnoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIgnoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIgnoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
