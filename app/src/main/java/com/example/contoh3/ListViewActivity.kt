package com.example.contoh3

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import  android.widget.TextView
import android.widget.Toast
import androidx.core.view.get

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        //code array untuk pemanggilan data listview
        val listView : ListView = findViewById<ListView>(R.id.listview1)
        val names : Array<String> = arrayOf("Galuh","Rizal","Wind","Rulan","Opik","Kilu","Orland")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names)

        listView.adapter= arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked" + names[position],
                Toast.LENGTH_LONG).show()
        }

    }
}