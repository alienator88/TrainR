package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.adapters.bicepsAdapter
import com.alienator88.trainr.R
import kotlinx.android.synthetic.main.rv_main.*


class bicepsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Biceps"
        val arrayList = ArrayList<Model>()
        val myAdapter = bicepsAdapter(arrayList, this)


        arrayList.add(Model("Wide Grip Standing Barbell Bicep Curl", "", R.drawable.biceps_1_wide_grip_standing_barbell_biceps_curl))
        arrayList.add(Model("Narrow Grip Standing Barbell Bicep Curl", "", R.drawable.biceps_2_narrow_grip_standing_barbell_biceps_curl))
        arrayList.add(Model("Wide Grip Standing EZ Bar Curl", "", R.drawable.biceps_3_wide_grip_standing_ez_bar_curl))
        arrayList.add(Model("Narrow Grip Standing EZ Bar Curl", "", R.drawable.biceps_4_narrow_grip_standing_ez_bar_curls))
        arrayList.add(Model("Standing Dumbbell Biceps Curl", "", R.drawable.biceps_5_standing_dumbbell_biceps_curl))
        arrayList.add(Model("Standing Alternate Dumbbell Bicep Curl", "", R.drawable.biceps_6_standing_alternate_dumbbell_biceps_curls))
        arrayList.add(Model("Standing Dumbbell Bicep Hammer Curl", "", R.drawable.biceps_7_standing_dumbbell_biceps_hammer_curls))
        arrayList.add(Model("Standing Alternate Dumbbell Bicep Hammer Curl", "", R.drawable.biceps_8_standing_alternate_dumbbell_biceps_hammer_curls))
        arrayList.add(Model("Standing Alternate Dumbbell Crossbody Bicep Hammer Curl", "", R.drawable.biceps_9_standing_alternate_dumbbell_crossbody_biceps_hammer_curls))
        arrayList.add(Model("Standing Dumbbell Inner Bicep Curl", "", R.drawable.biceps_10_standing_dumbbell_inner_biceps_curl))
        arrayList.add(Model("Seated Incline Dumbbell Inner Bicep Curl", "", R.drawable.biceps_11_seated_incline_dumbbell_inner_biceps_curl))
        arrayList.add(Model("Barbell Bicep Preacher Curl", "", R.drawable.biceps_12_barbell_biceps_preacher_curl))
        arrayList.add(Model("Two Arm Dumbbell Preacher Curl", "", R.drawable.biceps_13_two_arm_dumbbell_preacher_curl))
        arrayList.add(Model("One Arm Dumbbell Preacher Curl", "", R.drawable.biceps_14_one_arm_dumbbell_preacher_curl))
        arrayList.add(Model("Cable Bicep Preacher Curl", "", R.drawable.biceps_15_cable_biceps_preacher_curl))
        arrayList.add(Model("Overhead Bicep Cable Curl", "", R.drawable.biceps_16_overhead_biceps_cable_curl))
        arrayList.add(Model("Standing Cable Rope Hammer Curl", "", R.drawable.biceps_17_standing_cable_rope_hammer_curl))
        arrayList.add(Model("Standing Bicep Cable Curl", "", R.drawable.biceps_18_standing_biceps_cable_curl))
        arrayList.add(Model("One Arm Standing Cable Curl", "", R.drawable.biceps_19_one_arm_standing_cable_curls))
        arrayList.add(Model("Seated Incline Dumbbell Bicep Curl", "", R.drawable.biceps_20_seated_incline_dumbbell_biceps_curl))
        arrayList.add(Model("Seated Alternate Incline Dumbbell Bicep Curl", "", R.drawable.biceps_21_seated_alternate_incline_dumbbell_biceps_curl))
        arrayList.add(Model("Seated Incline Dumbbell bicep Hammer Curl", "", R.drawable.biceps_22_seated_incline_dumbbell_biceps_hammer_curl))
        arrayList.add(Model("Seated Alternate Incline Dumbbell Bicep Hammer Curl", "", R.drawable.biceps_23_seated_alternate_incline_dumbbell_biceps_hammer_curl))
        arrayList.add(Model("Lying Incline Barbell Bicep Curl", "", R.drawable.biceps_24_lying_incline_barbell_biceps_curl))
        arrayList.add(Model("Standing One Arm Dumbbell Incline Bicep Curl", "", R.drawable.biceps_25_standing_one_arm_dumbbell_incline_biceps_curl))
        arrayList.add(Model("Standing One Arm Concentration Curl", "", R.drawable.biceps_26_standing_one_arm_concentration_curls))
        arrayList.add(Model("Seated One Arm Concentration Curl", "", R.drawable.biceps_27_seated_one_arm_concentration_curls))
        arrayList.add(Model("Bicep Curl Machine", "", R.drawable.biceps_28_biceps_curl_machine))
        arrayList.add(Model("Lever Bicep Curl", "", R.drawable.biceps_29_lever_biceps_curl))






        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}