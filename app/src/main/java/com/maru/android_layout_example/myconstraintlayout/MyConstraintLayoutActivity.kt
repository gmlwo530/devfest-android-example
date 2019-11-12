package com.maru.android_layout_example.myconstraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.maru.android_layout_example.R

class MyConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val relativePostionButton: Button = findViewById(R.id.relative_position)
        val biasButton: Button = findViewById(R.id.bias)
        val percentButton: Button = findViewById(R.id.percent)
        val ratioButton: Button = findViewById(R.id.ratio)

        relativePostionButton.setOnClickListener {
            val i = Intent(this, RelativePositionActivity::class.java)
            startActivity(i)
        }

        biasButton.setOnClickListener {
            val i = Intent(this, BiasActivity::class.java)
            startActivity(i)
        }

        percentButton.setOnClickListener {
            val i = Intent(this, PercentActivity::class.java)
            startActivity(i)
        }

        ratioButton.setOnClickListener {
            val i = Intent(this, RatioActivity::class.java)
            startActivity(i)
        }
    }
}
