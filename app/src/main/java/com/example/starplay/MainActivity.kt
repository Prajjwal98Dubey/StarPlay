package com.example.starplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
   lateinit var etName:EditText
   lateinit var etAge:EditText
   lateinit var btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etname)
        etAge=findViewById(R.id.etage)
        btn=findViewById(R.id.button)

        btn.setOnClickListener {
            val username=etName.text.toString()
            val userage=etAge.text.toString().toInt()

            val intent=Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("UserName",username)
            intent.putExtra("UserAge",userage)
            startActivity(intent)

        }

    }
}