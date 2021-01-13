package com.example.textfieldsvalidation

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("NewApi", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var actv = (textInputLayout.editText as? AutoCompleteTextView)
        actv?.setAdapter(ArrayAdapter(this,R.layout.textview, arrayOf("one","two","three")))

        bt_show.setOnClickListener {
            if ( actv!!.text.toString().trim().isNotEmpty()){
                Toast.makeText(this, actv.text.toString().trim(),Toast.LENGTH_LONG).show()
            }
        }





    }

}