package com.example.gitlabtest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        println("This is for my second commit")

        println("This is 5th")

        print("Magic")

        println("Adawda")
        println("Adawda")
        println("Adawda")

        print("Magic Experimental 2")
        print("Magic Experimental 2")
        print("Magic Experimental 2 AVCDEFSFS")
        print("Change 2")



        print("TEST")


        println("WDOADMAPOFMA ABCDEF CHANGE 2")

        println("HELLO FROM FRIEND")

    }
}