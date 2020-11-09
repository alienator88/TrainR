package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.calvesAdapter
import kotlinx.android.synthetic.main.rv_main.*


class calvesMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Calves"
        val arrayList = ArrayList<Model>()
        val myAdapter = calvesAdapter(arrayList, this)


        arrayList.add(Model("Standing Calf Raises","",  R.drawable.calves_1_standing_calf_raises))
        arrayList.add(Model("Standing Dumbbell Calf Raises","",  R.drawable.calves_2_standing_dumbbell_calf_raises))
        arrayList.add(Model("Wall Sits On Toes","",  R.drawable.calves_3_wall_sits_on_toes))
        arrayList.add(Model("Single Leg Dumbbell Calf Raises","",  R.drawable.calves_4_single_leg_dumbbell_calf_raises))
        arrayList.add(Model("Shouldered Smith Machine Standing Calf Raises","",  R.drawable.calves_5_shouldered_smith_machine_standing_calf_raises))
        arrayList.add(Model("Hanging Grip Smith Machine Standing Calf Raises","",  R.drawable.calves_6_hanging_grip_smith_machine_standing_calf_raises))
        arrayList.add(Model("Bench Press Machine Standing Calf Raises","",  R.drawable.calves_7_bench_press_machine_standing_calf_raises))
        arrayList.add(Model("Calf Press On Leg Press Machine","",  R.drawable.calves_8_calf_press_on_leg_press_machine))
        arrayList.add(Model("Seated Barbell Calf Raises","",  R.drawable.calves_9_seated_barbell_calf_raises))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}