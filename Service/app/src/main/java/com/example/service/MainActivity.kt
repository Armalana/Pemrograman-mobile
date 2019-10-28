package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_facebook.setOnClickListener(){
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/langitinspirasi"))
            startActivity(i)
        }

        btn_instagram.setOnClickListener(){
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
            startActivity(i)
        }

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.pesona)

        btn_play.setOnClickListener(){
            MediaPlayer?.start()
        }

        btn_pause.setOnClickListener(){
            MediaPlayer?.pause()
        }

        btn_stop.setOnClickListener(){
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
