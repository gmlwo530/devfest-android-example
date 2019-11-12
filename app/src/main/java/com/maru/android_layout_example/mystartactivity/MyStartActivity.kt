package com.maru.android_layout_example.mystartactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.maru.android_layout_example.R

/*
* Created by CHOI HEE JAE on 2019-11-05
*/

class MyStartActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_start)

        val startActivityButton : Button = findViewById(R.id.start_activity)
        startActivityButton.setOnClickListener {
            val i = Intent(this, ExampleOne::class.java)
            startActivity(i)
        }
        val startActivityButtonWithData : Button = findViewById(R.id.start_activity_with_data)
        startActivityButtonWithData.setOnClickListener {
            val i = Intent(this, ExampleTwo::class.java)
            i.putExtra("data", "Hello, DevFest!!")
            startActivity(i)
        }
    }
}