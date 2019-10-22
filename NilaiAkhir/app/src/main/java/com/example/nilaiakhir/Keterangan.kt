package com.example.nilaiakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_keterangan.*

class Keterangan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keterangan)

        val bundle : Bundle = intent.extras!!
        var nimt = bundle.get("nim_value").toString()
        var namat = bundle.get("nama_value").toString()
        var nilait : String = bundle.get("nilai_value").toString()

        var ket : String = ""
        if(nilait.toInt() >= 80){
            ket = "A"
        }else if(nilait.toInt() >= 60){
            ket = "B"
        }else if(nilait.toInt() >= 40){
            ket = "C"
        }else if(nilait.toInt() >= 20){
            ket = "D"
        }else if(nilait.toInt() < 20){
            ket = "E"
        }

        fun changeText(view : View){
            nimk.setText("NIM         : $nimt")
            namk.setText("Nama        : $namat")
            nilk.setText("Nilai Angka : $nilait")
            ketk.setText("Keterangan  : $ket")
        }
    }
}
