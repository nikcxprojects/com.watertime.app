package com.watertime.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textView11.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Clear Mind").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        imageView29.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        textView17.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        imageView23.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Clear Mind").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        textView12.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Longer Life").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        imageView24.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Longer Life").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        textView13.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Weight Loss").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        imageView25.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "Weight Loss").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        textView14.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "More Energy").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        imageView26.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "More Energy").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        textView15.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "More Fun").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        imageView27.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose1", "More Fun").apply()
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

    }
}