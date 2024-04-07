package com.rzaninelli.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rzaninelli.temperatureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            if (!binding.editCelsius.text.isEmpty()) {

                val celsius = binding.editCelsius.text.toString().toDouble()
                val farenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.textResultado.text = "${farenheit} ºF"

            }
            else {
                binding.textResultado.text = "Temperatura Invalida!"
            }
        }
    }
}