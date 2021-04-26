package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var increment_button = 0;
       val plus = findViewById<Button>(R.id.increment_button)
       val text = findViewById<TextView>(R.id.textView)
        increment_button.setOnClickListener{
         increment_button++


        }
    }

}