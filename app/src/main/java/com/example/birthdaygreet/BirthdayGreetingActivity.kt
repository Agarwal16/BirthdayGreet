package com.example.birthdaygreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text = "Happy Birthday\n$name!"
    }
}