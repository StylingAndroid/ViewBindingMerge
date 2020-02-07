package com.stylingandroid.viewbindingmerge

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingmerge.databinding.ActivityMergeBinding

class MergeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMergeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val content = findViewById<ViewGroup>(android.R.id.content)
        binding = ActivityMergeBinding.inflate(layoutInflater, content)
    }
}
