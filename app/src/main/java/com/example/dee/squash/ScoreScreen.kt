package com.example.dee.squash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScoreScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun scoreNotificationTest(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val scoreToast = Toast.makeText(this, "Score Recorded!", Toast.LENGTH_SHORT)
        scoreToast.show()
    }
}
