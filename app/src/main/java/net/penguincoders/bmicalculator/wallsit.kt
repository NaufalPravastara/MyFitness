package net.penguincoders.bmicalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView


class wallsit : AppCompatActivity() {
    //declaring a null variable for videoview
    var vVideo: VideoView? = null
    //declaring a null variable for MediaController
    var mediaControls: MediaController? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallsit)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener(){
            intent = Intent(this, listgerakan::class.java)
            startActivity(intent)
        }

        vVideo = findViewById<View>(R.id.vwVideo) as VideoView

        if (mediaControls == null){
            mediaControls = MediaController( this)
            mediaControls!!.setAnchorView(this.vVideo)
        }
        //start video
        vVideo!!.setMediaController(mediaControls)
        vVideo!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.wallsit))

        vVideo!!.requestFocus()
        vVideo!!.start()

        //jika video sudah selesai
        vVideo!!.setOnCompletionListener {
            Toast.makeText(
                applicationContext, "Video Selesai",
                Toast.LENGTH_LONG).show()
        }
        //jika terjadi kesalahan
        vVideo!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(
                applicationContext, "Error" +
                        "Video Sedang Diputar!!!", Toast.LENGTH_LONG).show()
            false
        }

    }
}