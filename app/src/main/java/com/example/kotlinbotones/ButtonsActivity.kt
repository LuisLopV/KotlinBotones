package com.example.kotlinbotones

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ButtonsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buttons)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Button1 = findViewById<Button>(R.id.containedButton)
        val Button2 = findViewById<Button>(R.id.containedButton2)
        val Button3 = findViewById<Button>(R.id.outlinedButton)
        val Button4 = findViewById<Button>(R.id.outlinedButton2)
        val Button5 = findViewById<Button>(R.id.textButton)
        val Button6 = findViewById<Button>(R.id.textButton2)
        val Button7 = findViewById<Button>(R.id.button1)
        val Button8 = findViewById<Button>(R.id.button2)
        val Button9 = findViewById<Button>(R.id.button3)

        Button1.setOnClickListener(this)
        Button2.setOnClickListener(this)
        Button3.setOnClickListener(this)
        Button4.setOnClickListener(this)
        Button5.setOnClickListener(this)
        Button6.setOnClickListener(this)
        Button7.setOnClickListener(this)
        Button8.setOnClickListener(this)
        Button9.setOnClickListener(this)

    }
    override fun onClick(view:View){
        when(view.id){
            R.id.containedButton->Toast.makeText(this,"Contained Button",Toast.LENGTH_LONG).show()
            R.id.containedButton2->Toast.makeText(this,"Contained Button 2",Toast.LENGTH_LONG).show()
            R.id.outlinedButton->Toast.makeText(this,"Outlined Button",Toast.LENGTH_LONG).show()
            R.id.outlinedButton2->Toast.makeText(this,"Outlined Button 2",Toast.LENGTH_LONG).show()
            R.id.textButton->Toast.makeText(this,"Text Button",Toast.LENGTH_LONG).show()
            R.id.textButton2->Toast.makeText(this,"Text Button 2",Toast.LENGTH_LONG).show()
            R.id.button1->Toast.makeText(this,"Toggle Button 1",Toast.LENGTH_LONG).show()
            R.id.button2->Toast.makeText(this,"Toggle Button 2",Toast.LENGTH_LONG).show()
            R.id.button3->Toast.makeText(this,"Toggle Button 3",Toast.LENGTH_LONG).show()
        }

    }

}