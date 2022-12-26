package net.penguincoders.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class workoutweb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.workoutweb)

        val workout = findViewById<WebView>(R.id.workout)

        workout.webViewClient = WebViewClient()
        workout.loadUrl("https://www.merdeka.com/trending/workout-adalah-aktivitas-yang-dilakukan-untuk-memelihara-kebugaran-ketahui-jenisnya-kln.html")
        workout.settings.javaScriptEnabled = true
        workout.settings.setSupportZoom(true)

    }
}