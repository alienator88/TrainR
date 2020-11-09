package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.tricepsAdapter
import kotlinx.android.synthetic.main.rv_main.*


class tricepsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Triceps"
        val arrayList = ArrayList<Model>()
        val myAdapter = tricepsAdapter(arrayList, this)


        arrayList.add(Model("Triceps Dips", "", R.drawable.tricep_1_tricep_dips))
        arrayList.add(Model("Assisted Triceps Dips", "", R.drawable.tricep_2_assisted_tricep_dips))
        arrayList.add(Model("Triceps Dip Machine", "", R.drawable.tricep_3_tricep_dip_machine))
        arrayList.add(Model("Bench Triceps Dips", "", R.drawable.tricep_4_bench_tricep_dips))
        arrayList.add(Model("Weighted Bench Triceps Dips", "", R.drawable.tricep_5_weighted_bench_tricep_dips))
        arrayList.add(Model("Close Grip Barbell Bench Press", "", R.drawable.tricep_6_close_grip_barbell_bench_press))
        arrayList.add(Model("Seated Overhead Barbell Triceps Extensions", "", R.drawable.tricep_7_seated_overhead_barbell_tricep_extension))
        arrayList.add(Model("Seated Two Arm Overhead Dumbbell Triceps Extensions", "", R.drawable.tricep_8_seated_two_arm_overhead_dumbbell_tricep_extension))
        arrayList.add(Model("Standing One Arm Overhead Dumbbell Triceps Extensions", "", R.drawable.tricep_9_standing_one_arm_overhead_dumbbell_tricep_extensions))
        arrayList.add(Model("Standing Two Arm Overhead Rope Triceps Extensions", "", R.drawable.tricep_10_standing_two_arm_overhead_rope_tricep_extensions))
        arrayList.add(Model("Standing Overhead Cable Triceps Extensions", "", R.drawable.tricep_11_standing_overhead_cable_tricep_extensions))
        arrayList.add(Model("Standing Two Arm Overhead Dumbbell Triceps Extensions", "", R.drawable.tricep_12_standing_two_arm_overhead_dumbbell_tricep_extensions))
        arrayList.add(Model("Cable Bar Triceps Pushdown", "", R.drawable.tricep_13_cable_bar_tricep_pushdown))
        arrayList.add(Model("Cable V-Bar Triceps Pushdown", "", R.drawable.tricep_14_cable_v_bar_tricep_pushdown))
        arrayList.add(Model("One Arm Cable Triceps Pushdowns - Reverse Grip", "", R.drawable.tricep_15_one_arm_cable_tricep_pushdowns_reverse_grip))
        arrayList.add(Model("Cable Triceps Rope Pushdowns", "", R.drawable.tricep_16_cable_tricep_rope_pushdowns))
        arrayList.add(Model("Standing One Arm Triceps Pushdowns - Overhand Grip", "", R.drawable.tricep_17_standing_one_arm_tricep_pushdowns_overhand_grip))
        arrayList.add(Model("Incline Cable Triceps Extensions", "", R.drawable.tricep_18_incline_cable_tricep_extensions))
        arrayList.add(Model("Lying Barbell Triceps Extensions", "", R.drawable.tricep_19_lying_barbell_tricep_extensions))
        arrayList.add(Model("Lying Dumbbell Triceps Extensions", "", R.drawable.tricep_20_lying_dumbbell_tricep_extensions))
        arrayList.add(Model("One Arm Triceps Kick-Backs", "", R.drawable.tricep_21_one_arm_tricep_kick_backs))






        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}