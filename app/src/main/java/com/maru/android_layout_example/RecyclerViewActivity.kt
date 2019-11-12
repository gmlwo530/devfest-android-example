package com.maru.android_layout_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


/*
* Created by CHOI HEE JAE on 2019-10-26
*/

class RecyclerViewActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val horizontalRecyclerView: RecyclerView = findViewById(R.id.horizontal_recycler_view)
        horizontalRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        horizontalRecyclerView.adapter = MyRecyclerAdapter(this)

        val verticalRecyclerView: RecyclerView = findViewById(R.id.vertical_recycler_view)
        verticalRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        verticalRecyclerView.adapter = MyRecyclerAdapter(this)
    }

}