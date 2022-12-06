package com.watertime.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.NullPointerException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity2 : AppCompatActivity() {

    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val purpose1 =
            PreferenceManager.getDefaultSharedPreferences(this).getString("purpose1", "Set a purpose")

        val purpose2 =
            PreferenceManager.getDefaultSharedPreferences(this).getString("purpose2", "Set a goal")

        try {
            fetchArrayList()
            fetchArrayList2()
        }catch (e: NullPointerException){

        }

        val day = SimpleDateFormat("dd")
        val currentDate_day = day.format(Date())

        val days =
            PreferenceManager.getDefaultSharedPreferences(this).getString("day", "0")

        if(currentDate_day.toInt() > days!!.toInt()){
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("day", currentDate_day).apply()
            var mls = ""
            if(purpose2 == "Set a goal"){
                mls = "2000"
            }else{
                mls = purpose2!!.substringBefore(" ")
            }
            val ml =
                PreferenceManager.getDefaultSharedPreferences(this).getString("ml", "2000")
            val sdf = SimpleDateFormat("dd-0M-yyyy")
            val currentDate = sdf.format(Date())
            val left = mls.toInt() -  ml!!.toInt()
            saveObjectToArrayList(currentDate)
            saveObjectToArrayList2(left.toString() + "mL")
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("ml", "$mls").apply()
        }else{

        }

        textView.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }

        imageView4.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }

        textView2.setOnClickListener {
            startActivity(Intent(this,MainActivity4::class.java))
        }

        imageView10.setOnClickListener {
            startActivity(Intent(this,MainActivity4::class.java))
        }

        imageView18.setOnClickListener {
            startActivity(Intent(this,MainActivity5::class.java))
        }

        imageView22.setOnClickListener {
            val text_ml = editTextTextPersonName.text
            if(textView19.text != "0") {
                editTextTextPersonName.setText("")
                textView19.text =
                    (textView19.text.toString().toInt() - text_ml.toString().toInt()).toString()
            }else{

            }
        }

        textView5.setOnClickListener {
            editTextTextPersonName.setText("200")
        }

        textView6.setOnClickListener {
            editTextTextPersonName.setText("100")
        }

        textView7.setOnClickListener {
            editTextTextPersonName.setText("250")
        }

        textView8.setOnClickListener {
            editTextTextPersonName.setText("500")
        }

        val ml =
            PreferenceManager.getDefaultSharedPreferences(this).getString("ml", "2000")
        textView19.text = ml
        textView3.text = " To reach $purpose1 \n you have to drink \n $purpose2 water every day. \n\n Left to drink today:"
        textView.text = purpose1
        textView2.text = purpose2

    }

    fun saveObjectToArrayList(yourObject: String) {
        val bookmarks = DataArraylist.DataAray
        var idex = PreferenceManager.getDefaultSharedPreferences(this).getInt("idexs", 0)
        bookmarks?.add(idex, yourObject)
        val prefsEditor = this?.getSharedPreferences("sharedPrefs", MODE_PRIVATE)?.edit()

        val json = gson.toJson(bookmarks)
        prefsEditor?.putString("data", json)
        prefsEditor?.apply()
        idex++
        PreferenceManager.getDefaultSharedPreferences(this).edit()
            .putInt("idexs", idex).apply()
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

    fun saveObjectToArrayList2(yourObject: String) {
        val bookmarks = DataArraylist.MlArray
        var idex = PreferenceManager.getDefaultSharedPreferences(this).getInt("idexss", 0)
        bookmarks?.add(idex, yourObject)
        val prefsEditor = this?.getSharedPreferences("sharedPrefs", MODE_PRIVATE)?.edit()

        val json = gson.toJson(bookmarks)
        prefsEditor?.putString("ml", json)
        prefsEditor?.apply()
        idex++
        PreferenceManager.getDefaultSharedPreferences(this).edit()
            .putInt("idexss", idex).apply()
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



    override fun onStop() {
        PreferenceManager.getDefaultSharedPreferences(this).edit()
            .putString("ml", "${textView19.text}").apply()
        super.onStop()
    }
}