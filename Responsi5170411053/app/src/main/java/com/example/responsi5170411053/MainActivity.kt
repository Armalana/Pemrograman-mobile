package com.example.responsi5170411053

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regsini.setOnClickListener() {
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
