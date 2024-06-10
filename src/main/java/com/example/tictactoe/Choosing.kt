package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choosing : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosing)
        var a:Button=findViewById(R.id.button2)
        var b:Button=findViewById(R.id.button3)
        var i=Intent(this,AgainstCPU::class.java)
        i.putExtra("value","1")
        a.setOnClickListener(){
            i.putExtra("value","1")
            startActivity(i)
        }
        b.setOnClickListener(){
            i.putExtra("value","2")
            startActivity(i)
        }
    }
}