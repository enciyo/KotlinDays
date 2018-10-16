package com.example.enciyo.myapplication.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.enciyo.myapplication.R
import com.example.enciyo.myapplication.goIntent
import com.example.enciyo.myapplication.showToast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity","Button was clicked")
            showToast("Button onClicked")
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message:String = etUserMessage.text.toString()
            showToast("Button onClicked")

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userMessage",message)
            startActivity(intent)
        }

        //Branch ShareButton

        btnShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Please select app: "))
        }

        //Recycler View

        btnRecyclerView.setOnClickListener {
          goIntent(HobbiesActivity::class.java)
        }

    }

}
