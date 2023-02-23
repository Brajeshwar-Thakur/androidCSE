package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                                      // splash screen
        var img:ImageView = findViewById(R.id.image1)
        Handler(Looper.getMainLooper()).postDelayed({ val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish() }, 10000)
        // 10000 means 10 sec it will show in beginning

    }
}