package com.example.presidenri

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Presiden = arrayOf<String>("Soekarno", "Soeharto", "B.J. Habibie", "Abdurahman Wahid", "Megawati Soekarno Putri",
            "Susilo Bambang Yudoyono", "Joko Widodo")

        val Keterangan = arrayOf<String>(
            "Presiden Pertama Indonesia",
            "Presiden Kedua Indonesia",
            "Presiden Ketiga Indonesia",
            "Presiden Keempat Indonesia",
            "Presiden Kelima Indonesia",
            "Presiden Keenam Indonesia",
            "Presiden Ketujuh Indonesia"
        )

        val Gambar = arrayOf<Int>(
            R.mipmap.soekarno, R.mipmap.soeharto,R.mipmap.habibie,
            R.mipmap.gusdur,R.mipmap.mgwati,R.mipmap.sby,
            R.mipmap.jokowi
        )

        list_view.adapter = MyListAdapter(this,Presiden,Keterangan,Gambar)

        list_view.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "Presiden : ${Presiden[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
