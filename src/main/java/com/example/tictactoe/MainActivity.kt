package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a:Button=findViewById(R.id.button2)
        val c:Button=findViewById(R.id.button3)
        val b= Intent(this,Multiplayer::class.java)
        val d:Intent=Intent(this,Choosing::class.java)
        a.setOnClickListener {
            startActivity(b)
        }
        c.setOnClickListener{
            startActivity(d)
        }
    }
}