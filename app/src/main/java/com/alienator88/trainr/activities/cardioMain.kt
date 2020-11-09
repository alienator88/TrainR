package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.cardioAdapter
import kotlinx.android.synthetic.main.rv_main.*


class cardioMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Cardio"
        val arrayList = ArrayList<Model>()
        val myAdapter = cardioAdapter(arrayList, this)


        arrayList.add(Model("Cross Trainer", "", R.drawable.cardio_1_cross_trainer))
        arrayList.add(Model("Stationary Cycle", "", R.drawable.cardio_2_stationary_cycle))
        arrayList.add(Model("Treadmill Jog", "", R.drawable.cardio_3_treadmill_jog))
        arrayList.add(Model("Rower", "", R.drawable.cardio_4_rower))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}