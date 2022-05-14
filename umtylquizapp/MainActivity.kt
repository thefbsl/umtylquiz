package com.example.umtylquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN;

        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if(etName.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Enter text", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}