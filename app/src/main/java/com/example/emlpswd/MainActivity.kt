package com.example.emlpswd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailText = findViewById<EditText>(R.id.email)
        var pswdText = findViewById<EditText>(R.id.pswd)
        var clickButton = findViewById<Button>(R.id.click)
        var frgt = findViewById<TextView>(R.id.forget)

        clickButton.setOnClickListener {

            var intent = Intent(this, HomePageActivity::class.java)

            intent.putExtra("email", emailText.text.toString())
            intent.putExtra("pswd", pswdText.text.toString())

            startActivity(intent)
        }
        frgt.setOnClickListener{
            var intent = Intent(this, OTP::class.java)

            intent.putExtra("forget", frgt.text.toString())

            startActivity(intent)
        }
    }
}