package com.roadtocode.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val etRollNo: EditText = findViewById(R.id.etRollNo)

        val btnGo: Button = findViewById(R.id.btnGo)
        btnGo.setOnClickListener {

            val intent = Intent(this, Home::class.java)

            intent.putExtra("studentName", etName.text.toString())
            intent.putExtra("rollNo", etRollNo.text.toString().toInt())

            startActivity(intent)

        }
    }

}