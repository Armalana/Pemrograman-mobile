package com.example.nilaiakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nima : String = nim.toString()
        var namaa : String = nama.toString()
        var nilaia : String = nilai.toString()

        proses.setOnClickListener(){
            intent = Intent(this, Keterangan::class.java)
            intent.putExtra("nim_value", nima)
            intent.putExtra("nama_value", namaa)
            intent.putExtra("nilai_value", nilaia)
            startActivity(intent)
        }
    }
}
