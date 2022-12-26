package net.penguincoders.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class listgerakan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listgerakan)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var Jump = findViewById<CardView>(R.id.video1)
        var Wallsit = findViewById<CardView>(R.id.video2)
        var Pushup = findViewById<CardView>(R.id.video3)
        var Abdominal = findViewById<CardView>(R.id.video4)
        var Stepup = findViewById<CardView>(R.id.video5)
        var Squat = findViewById<CardView>(R.id.video6)
        var Triceps = findViewById<CardView>(R.id.video7)
        var Plank = findViewById<CardView>(R.id.video8)
        var Highknees = findViewById<CardView>(R.id.video9)
        var Lunge = findViewById<CardView>(R.id.video10)
        var Pushupand = findViewById<CardView>(R.id.video11)
        var Sideplank = findViewById<CardView>(R.id.video12)

        Jump.setOnClickListener(){
            intent = Intent(this, jump::class.java)
            startActivity(intent)
        }
        Wallsit.setOnClickListener(){
            intent = Intent(this, wallsit::class.java)
            startActivity(intent)
        }
        Pushup.setOnClickListener(){
            intent = Intent(this, pushup::class.java)
            startActivity(intent)
        }
        Abdominal.setOnClickListener(){
            intent = Intent(this, abdominal::class.java)
            startActivity(intent)
        }
        Stepup.setOnClickListener() {
            intent = Intent(this, stepup::class.java)
            startActivity(intent)
        }

        Squat.setOnClickListener(){
            intent = Intent(this, squat::class.java)
            startActivity(intent)
        }

        Triceps.setOnClickListener(){
            intent = Intent(this, triceps::class.java)
            startActivity(intent)
        }

        Plank.setOnClickListener(){
            intent = Intent(this, plank::class.java)
            startActivity(intent)
        }

        Highknees.setOnClickListener(){
            intent = Intent(this, highknees::class.java)
            startActivity(intent)
        }

        Lunge.setOnClickListener(){
            intent = Intent(this, lunge::class.java)
            startActivity(intent)
        }

        Pushupand.setOnClickListener(){
            intent = Intent(this, pushupand::class.java)
            startActivity(intent)
        }

        Sideplank.setOnClickListener(){
            intent = Intent(this, sideplank::class.java)
            startActivity(intent)
        }
    }
}