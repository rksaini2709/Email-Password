package com.example.emlpswd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var homePageTextView = findViewById<TextView>(R.id.home_page_text)

        intent?.let {
            var email = it.getStringExtra("email")
            var pswd = it.getStringExtra("pswd")

            homePageTextView.text = "$email and $pswd"
        }
    }
}
