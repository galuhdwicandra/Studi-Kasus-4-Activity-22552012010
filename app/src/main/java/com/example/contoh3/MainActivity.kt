package com.example.contoh3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //button pemanggilan login
        val button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            val intentlogin = Intent(this, LoginActivity::class.java)
            startActivity(intentlogin)
        }

        //button pemanggilan register
        val button2 = findViewById<Button>(R.id.btn2)
        button2.setOnClickListener {
            val intentRegister = Intent(this, RegisterActivity::class.java)
            startActivity(intentRegister)
        }

    }

}


