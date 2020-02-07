package com.stylingandroid.viewbindingmerge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingmerge.databinding.ActivityFlattenBinding

class FlattenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFlattenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlattenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
