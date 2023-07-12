package com.clinton.nestedrecycleviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.clinton.nestedrecycleviewapp.adapter.MainAdapter
import com.clinton.nestedrecycleviewapp.databinding.ActivityMainBinding
import com.clinton.nestedrecycleviewapp.utils.SampleData

private var Nothing?.adapter: MainAdapter
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val rvMain = null
            rvMain.adapter=MainAdapter(SampleData.collections)
        }

    }
}