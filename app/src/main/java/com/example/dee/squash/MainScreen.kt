package com.example.dee.squash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun beginNotificationTest(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val beginToast = Toast.makeText(this, "Begun", Toast.LENGTH_SHORT)
        beginToast.show()
    }
}
