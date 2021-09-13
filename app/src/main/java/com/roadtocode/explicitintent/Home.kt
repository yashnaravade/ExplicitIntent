package com.roadtocode.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val studentName: String = intent.getStringExtra("studentName").toString()
        val rollNo: Int = intent.getIntExtra("rollNo", 0)

        val tvName: TextView = findViewById(R.id.tvName)
        tvName.text = studentName

        val tvRollNo: TextView = findViewById(R.id.tvRollNo)
        tvRollNo.text = rollNo.toString()


    }
}