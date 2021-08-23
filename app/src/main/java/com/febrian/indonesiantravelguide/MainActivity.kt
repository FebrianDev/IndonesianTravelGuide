package com.febrian.indonesiantravelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.febrian.indonesiantravelguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: TravelViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(TravelViewModel::class.java)
        viewModel.getData().observe(this, {
            binding.shimmerFrameLayout.visibility = View.GONE
            binding.shimmerFrameLayout1.visibility = View.GONE
            binding.rv.visibility = View.VISIBLE
            binding.rv.layoutManager = LinearLayoutManager(this)
            binding.rv.adapter = ListAdapter(it)
        })
    }
}