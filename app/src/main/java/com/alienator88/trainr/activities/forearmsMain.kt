package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.forearmsAdapter
import kotlinx.android.synthetic.main.rv_main.*


class forearmsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Forearms"
        val arrayList = ArrayList<Model>()
        val myAdapter = forearmsAdapter(arrayList, this)


        arrayList.add(Model("Palms Down Barbell Wrist Curl", "", R.drawable.forearms_1_palms_down_barbell_wrist_curl))
        arrayList.add(Model("Barbell Bench Palms Up Wrist Curl", "", R.drawable.forearms_2_barbell_bench_palms_up_wrist_curl))
        arrayList.add(Model("Seated Palms Up Wrist Curl", "", R.drawable.forearms_3_seated_palms_up_wrist_curl))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}