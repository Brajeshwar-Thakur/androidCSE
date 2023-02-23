package com.example.myapplication

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class Student_Camera_Intent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var filepath: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_camera_intent)
        var btUpload:Button = findViewById(R.id.button)
        var Iview:ImageView = findViewById(R.id.imageView)
        val A = registerForActivityResult(ActivityResultContracts.GetContent()) {
            filepath = it!!
            Iview.setImageURI(it)
        }
        btUpload.setOnClickListener() {
            A.launch("image/*")

        }

    }
}
