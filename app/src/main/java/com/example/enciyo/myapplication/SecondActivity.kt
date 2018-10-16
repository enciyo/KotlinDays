package com.example.enciyo.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? =intent.extras
        val msg =bundle!!.getString("userMessage")

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        Log.i("SecondActivty",msg)

        txvUserMessage.text="Your Message\n" + msg.toString()
    }
}