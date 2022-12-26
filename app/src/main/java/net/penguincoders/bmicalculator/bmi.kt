package net.penguincoders.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.math.pow

class bmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.hide()
        val imageweight = findViewById<ImageView>(R.id.image_weight)
        val imageheight = findViewById<ImageView>(R.id.image_height)
        val weight = findViewById<EditText>(R.id.weight_value)
        val height = findViewById<EditText>(R.id.height_value)
        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val bmi = findViewById<TextView>(R.id.bmi)
        val bmiStatus = findViewById<TextView>(R.id.bmi_status)
        val bmiView = findViewById<LinearLayout>(R.id.bmiView)
        val calculateAgainButton = findViewById<TextView>(R.id.calculate_again)


        calculateButton.setOnClickListener {
            var weightValue = 0.0
            var heightValue = 0.0
            if (weight.text.toString().isNotEmpty()) {
                weightValue = weight.text.toString().toDouble()
            }
            if (height.text.toString().isNotEmpty()) {
                heightValue = (height.text.toString().toDouble() / 100)
            }
            if (weightValue > 0.0 && heightValue > 0.0) {
                val bmiValue = String.format("%.2f", weightValue / heightValue.pow(2) )
                bmi.text = bmiValue
                bmiStatus.text = bmiStatusValue(weightValue / heightValue.pow(2) )
                bmiView.visibility = View.VISIBLE
                calculateButton.visibility = View.GONE
            } else
                Toast.makeText(this, "Please Input Weight and Height Values greater than 0", Toast.LENGTH_LONG).show()
        }

        calculateAgainButton.setOnClickListener {
            bmiView.visibility = View.GONE
            calculateButton.visibility = View.VISIBLE
            weight.text.clear()
            height.text.clear()
            weight.requestFocus()
        }
    }

    private fun bmiStatusValue(bmi: Double): String {
        lateinit var bmiStatus: String
        if (bmi < 18.5)
            bmiStatus = "Underweight, Tambah Porsi Makan Anda"
        else if (bmi >= 18.5 && bmi < 25)
            bmiStatus = "Normal, Kondisi Tubuh Anda Ideal"
        else if (bmi >= 25 && bmi < 30)
            bmiStatus = "Overweight, Lakukan Beberapa Olahraga"
        else if (bmi > 30)
            bmiStatus = "Obese, Lakukan Olahraga Dengan Rutin!"
        return bmiStatus
    }
}