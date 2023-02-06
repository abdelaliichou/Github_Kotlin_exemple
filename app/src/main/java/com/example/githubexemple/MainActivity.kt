package com.example.githubexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("This message is in the third commit !")

        print("This message is in the forth commit !")

        print("This message is in the fifth commit !")

        print("This message is in the sixth commit !")
    }
}