package com.watertime.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main5.*
import java.lang.NullPointerException
import java.util.ArrayList

class MainActivity5 : AppCompatActivity() {

    val adapter = rcAdapter()
    private val gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        imageView29.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        textView17.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        try {
            fetchArrayList()
            fetchArrayList2()
        }catch (e:NullPointerException){

        }

        init()
    }

    fun fetchArrayList(): ArrayList<String> {
        val json = applicationContext?.getSharedPreferences("sharedPrefs", MODE_PRIVATE)?.getString("data", "")

        DataArraylist.DataAray = when {
            json.isNullOrEmpty() -> ArrayList()
            else -> gson.fromJson(json, object : TypeToken<List<String>>() {}.type)
        }

        Log.d("sadasd", DataArraylist.DataAray.toString())
        return DataArraylist.DataAray
    }

    fun fetchArrayList2(): ArrayList<String> {
        val json = applicationContext?.getSharedPreferences("sharedPrefs", MODE_PRIVATE)?.getString("ml", "")

        DataArraylist.MlArray = when {
            json.isNullOrEmpty() -> ArrayList()
            else -> gson.fromJson(json, object : TypeToken<List<String>>() {}.type)
        }

        Log.d("sadasd", DataArraylist.MlArray.toString())
        return DataArraylist.MlArray
    }

    private fun init() {
        this.apply {
            for (it in 1 until DataArraylist.DataAray!!.size) {
                val plant = Data(DataArraylist.DataAray!![it],DataArraylist.MlArray!![it])
                adapter.addPlant(plant)
                rc_view.layoutManager = LinearLayoutManager(this)
                rc_view.adapter = adapter
            }
        }
    }
}