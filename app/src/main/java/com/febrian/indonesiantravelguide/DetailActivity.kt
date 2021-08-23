package com.febrian.indonesiantravelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febrian.indonesiantravelguide.ListAdapter.Companion.KEY_DATA
import com.febrian.indonesiantravelguide.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<Model>(KEY_DATA) as Model
        binding.imgSlider.setSliderAdapter(ImageSliderAdapter(data.images))
    }
}