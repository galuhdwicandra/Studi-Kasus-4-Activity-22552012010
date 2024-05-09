package com.example.contoh3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //button pemanggil untuk masuk ke data listview
        val button4: Button = findViewById<Button>(R.id.btn4)
        button4.setOnClickListener {
            val intentListView = Intent(this, ListViewActivity::class.java)
            startActivity(intentListView)
        }
    }
}