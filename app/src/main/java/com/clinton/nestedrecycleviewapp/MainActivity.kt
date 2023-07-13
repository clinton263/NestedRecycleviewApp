package com.clinton.nestedrecycleviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.clinton.nestedrecycleviewapp.adapter.MainAdapter
import com.clinton.nestedrecycleviewapp.databinding.ActivityMainBinding
import com.clinton.nestedrecycleviewapp.utils.SampleData






class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val rvMain = null
            MainAdapter(SampleData.collections).also { rvMain.adapter = it }
        }

    }
}