package com.watertime.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        imageView29.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        textView17.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        textView11.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "2000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "2000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        imageView23.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "2000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "2000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        textView12.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "2500 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "2500").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        imageView24.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "2500 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "2500").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        textView13.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "3000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "3000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        imageView25.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "3000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "3000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        textView14.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "3500 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "3500").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        imageView26.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "3500 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "3500").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        textView15.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "4000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "4000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        imageView27.setOnClickListener {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("purpose2", "4000 mL").apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "4000").apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

    }
}