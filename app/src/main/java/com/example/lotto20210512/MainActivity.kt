package com.example.lotto20210512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

import com.androidapp.lotto20210512.ConstellationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CnsCardView = findViewById<CardView>(R.id.CnsCardView)

        CnsCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
    }

}