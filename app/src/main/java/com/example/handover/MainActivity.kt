package com.example.handover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_in_button.setOnClickListener{
            val username = username_text.text.toString()
            val password = password_text.text.toString()

            Log.d("Main Activity", "Username is "+ username)
            Log.d("Main Activity", "Password: $password")
        }

        create_account_text.setOnClickListener {
            Log.d("Main Activity", "Try to show registering screen")
        }
    }
}
