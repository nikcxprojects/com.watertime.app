package com.watertime.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView6.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        imageView8.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        imageView9.setOnClickListener {
            val a = Intent(Intent.ACTION_MAIN)
            a.addCategory(Intent.CATEGORY_HOME)
            a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(a)
        }

        imageView7.setOnClickListener {
            val a = Intent(Intent.ACTION_MAIN)
            a.addCategory(Intent.CATEGORY_HOME)
            a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(a)
        }

        imageView5.setOnClickListener {
            startActivity(Intent(this,WebActivity::class.java))
        }
    }
}