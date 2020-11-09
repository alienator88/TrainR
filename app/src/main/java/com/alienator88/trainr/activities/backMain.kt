package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.backAdapter
import kotlinx.android.synthetic.main.rv_main.*


class backMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Back"
        val arrayList = ArrayList<Model>()
        val myAdapter = backAdapter(arrayList, this)


        arrayList.add(Model("Wide Grip Overhand Chin Ups", "", R.drawable.back_1_wide_grip_overhand_chin_ups))
        arrayList.add(Model("Assisted Wide Grip Overhand Chin Ups", "", R.drawable.back_2_assisted_wide_grip_overhand_chin_ups))
        arrayList.add(Model("Close Grip Underhand Chin Ups", "", R.drawable.back_3_close_grip_underhand_chin_ups))
        arrayList.add(Model("Assisted Close Grip Underhand Chin Ups", "", R.drawable.back_4_assisted_close_grip_underhand_chin_ups))
        arrayList.add(Model("Close Grip V-Bar Pulldown", "", R.drawable.back_5_close_grip_vbar_pulldown))
        arrayList.add(Model("Underhand Grip Lat Pulldown Machine", "", R.drawable.back_6_underhand_grip_lat_pulldown_machine))
        arrayList.add(Model("Wide Overhand Grip Lat Pulldown", "", R.drawable.back_7_wide_overhand_grip_lat_pulldown))
        arrayList.add(Model("Narrow Underhand Grip Lat Pulldown", "", R.drawable.back_8_narrow_underhand_grip_lat_pulldown))
        arrayList.add(Model("Wide Underhand Grip Lat Pulldown", "", R.drawable.back_9_wide_underhand_grip_lat_pulldown))
        arrayList.add(Model("Overhand Grip Barbell Bent Over Rows", "", R.drawable.back_10_overhand_grip_barbell_bent_over_rows))
        arrayList.add(Model("Underhand Grip Smith Machine Bent Over Rows", "", R.drawable.back_11_underhand_grip_smith_machine_bent_over_rows))
        arrayList.add(Model("Incline Bench Barbell Rows", "", R.drawable.back_12_incline_bench_barbell_rows))
        arrayList.add(Model("Incline Bench Dumbbell Rows", "", R.drawable.back_13_incline_bench_dumbbell_rows))
        arrayList.add(Model("Barbell Underhand Bent Over Row", "", R.drawable.back_14_barbell_underhand_bent_over_row))
        arrayList.add(Model("Dumbbell Bent Over Rows", "", R.drawable.back_15_dumbbell_bent_over_rows))
        arrayList.add(Model("T-Bar Rows", "", R.drawable.back_16_tbar_rows))
        arrayList.add(Model("Lever Rows", "", R.drawable.back_17_lever_rows))
        arrayList.add(Model("Seated Cable Row", "", R.drawable.back_18_seated_cable_row))
        arrayList.add(Model("Bent Bar Seated Cable Row", "", R.drawable.back_19_bent_bar_seated_cable_row))
        arrayList.add(Model("Wide Grip Seated Cable Row", "", R.drawable.back_20_wide_grip_seated_cable_row))
        arrayList.add(Model("Seated Cable Row Machine", "", R.drawable.back_21_seated_cable_row_machine))
        arrayList.add(Model("One Arm Seated Cable Row Machine", "", R.drawable.back_22_one_arm_seated_cable_row_machine))
        arrayList.add(Model("One Arm Dumbbell Row On Bench", "", R.drawable.back_23_one_arm_dumbbell_row_on_bench))
        arrayList.add(Model("One Arm Dumbbell Row On Track", "", R.drawable.back_24_one_arm_dumbbell_row_on_rack))
        arrayList.add(Model("One Arm Shotgun Rows", "", R.drawable.back_25_one_arm_shotgun_rows))
        arrayList.add(Model("Barbell One Arm Bent Over Rows", "", R.drawable.back_26_barbell_one_arm_bent_over_rows))
        arrayList.add(Model("Overhand Grip Inverted Back Row", "", R.drawable.back_27_overhand_grip_inverted_back_row))
        arrayList.add(Model("Underhand Grip Inverted Back Row", "", R.drawable.back_28_underhand_grip_inverted_back_row))
        arrayList.add(Model("Hyperextensions", "", R.drawable.back_29_hyperextensions))
        arrayList.add(Model("Plate Hyperextensions", "", R.drawable.back_30_plate_hyperextensions))
        arrayList.add(Model("Hyperextension Machine", "", R.drawable.back_31_hyperextension_machine))
        arrayList.add(Model("Smith Machine Deadlifts", "", R.drawable.back_32_smith_machine_deadlifts))
        arrayList.add(Model("Standing Cable Bar Lat Pushdown", "", R.drawable.back_33_standing_cable_bar_lat_pushdown))
        arrayList.add(Model("Standing Cable Rope Lat Pushdown", "", R.drawable.back_34_standing_cable_rope_lat_pushdown))
        arrayList.add(Model("Incline Cable Lat Pushdown", "", R.drawable.back_35_incline_cable_lat_pushdown))
        arrayList.add(Model("London Bridges", "", R.drawable.back_36_london_bridges))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}