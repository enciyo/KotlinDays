package com.example.enciyo.myapplication

import android.app.Activity
import android.content.Intent
import android.widget.Toast

fun Activity.showToast(message: String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

fun Activity.goIntent(cls:Class<*>) {
    val intent=Intent(this,cls)
    startActivity(intent)
}