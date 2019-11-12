package com.maru.android_layout_example.mystartactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.maru.android_layout_example.R


/*
* Created by CHOI HEE JAE on 2019-11-05
*/

class ExampleTwo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_two)

        val myDataTextView : TextView = findViewById(R.id.my_data)
        myDataTextView.text = "My Data : " + intent.getStringExtra("data")

        val button: Button = findViewById(R.id.back_button)
        button.setOnClickListener {
            finish()
        }
    }
}