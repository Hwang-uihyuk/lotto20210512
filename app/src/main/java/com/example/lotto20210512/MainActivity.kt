package com.example.lotto20210512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CnsCardView = findViewById<CardView>(R.id.CnsCardView)

        CnsCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))

            val CnsNameView = findViewById<CardView>(R.id.CnsNameView)

            CnsNameView.setOnClickListener{
                startActivity(Intent(this@MainActivity, NameActivity::class.java))
            }

        }
    }

}