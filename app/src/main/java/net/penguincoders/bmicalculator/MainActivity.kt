package net.penguincoders.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web = findViewById<CardView>(R.id.webview)
        val bomas = findViewById<CardView>(R.id.bomas)
        val listg = findViewById<CardView>(R.id.lg)
        val aboutapps = findViewById<CardView>(R.id.aboutme)

        web.setOnClickListener() {
            intent = Intent(this, workoutweb::class.java)
            startActivity(intent)
        }
        bomas.setOnClickListener() {
            intent = Intent(this, bmi::class.java)
            startActivity(intent)
        }
        listg.setOnClickListener() {
            intent = Intent(this, listgerakan::class.java)
            startActivity(intent)
        }
        aboutapps.setOnClickListener() {
            intent = Intent(this, about::class.java)
            startActivity(intent)
        }
    }
}