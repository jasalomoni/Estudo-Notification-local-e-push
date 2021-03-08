package com.one.digitalinnovation.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

lateinit var btnSend: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btn_send_notification)
        btnSend.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android curso")
        }

        Log.i("*** newToken", FirebaseInstanceId.getInstance().token.toString())
    }
}