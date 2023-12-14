package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                if(login.text.toString() == LOGIN &&
                    password.text.toString() == PASS)
                    result.text = getString(R.string.success)
                else
                    result.text = getString(R.string.failure)
            }
        }
    }

    companion object {
        const val LOGIN = "login"
        const val PASS = "123456"
    }
}