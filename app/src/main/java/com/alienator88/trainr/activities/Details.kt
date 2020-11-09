package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.alienator88.trainr.R
import kotlinx.android.synthetic.main.rv_details.*


class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_details)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)


        var intent = intent
        val gTitle = intent.getStringExtra("gTitle")
        val gDesc = intent.getStringExtra("gDesc")
        val gImage = intent.getIntExtra("gImage",0)

        actionBar.title = "Back"
        titleTv.text = gTitle
        descTv.text = gDesc
        imageIv.setImageResource(gImage)

    }
}