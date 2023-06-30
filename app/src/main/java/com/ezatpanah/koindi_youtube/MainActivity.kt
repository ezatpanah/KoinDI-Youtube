package com.ezatpanah.koindi_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.koindi_youtube.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bird: Bird by inject()

        binding.tvText.text = bird.birdDesc()

    }
}