package com.example.myapplication

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MyProfile_StylesWidgets : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var t: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myprofile_style_widget)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val nv=findViewById<BottomNavigationView>(R.id.bottomNav)
            t=findViewById(R.id.tv)
            nv.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.action_favorites -> {
                        setContent("favorite")
                        true
                    }
                    R.id.menu_profile -> {
                        setContent("Profile")
                        true
                    }

                    R.id.nav_send -> {
                        setContent("Send")
                        true
                    }
                    else -> false
                }
            }
        }
        fun setContent(s:String)
        {
            setTitle(s)
            t.setText(s)
        }

}