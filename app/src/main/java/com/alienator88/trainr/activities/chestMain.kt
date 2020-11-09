package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.chestAdapter
import kotlinx.android.synthetic.main.rv_main.*


class chestMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Chest"
        val arrayList = ArrayList<Model>()
        val myAdapter = chestAdapter(arrayList, this)


        arrayList.add(Model("Incline Barbell Chest Press", "", R.drawable.chest_1_incline_barbell_chest_press))
        arrayList.add(Model("Incline Dumbbell Chest Press", "", R.drawable.chest_2_incline_dumbbell_chest_press))
        arrayList.add(Model("Incline Smith Machine Chest Press", "", R.drawable.chest_3_incline_smith_machine_chest_press))
        arrayList.add(Model("Flat Barbell Chest Press", "", R.drawable.chest_4_flat_barbell_chest_press))
        arrayList.add(Model("Flat Dumbbell Chest Press", "", R.drawable.chest_5_flat_dumbbell_chest_press))
        arrayList.add(Model("Lying Machine Chest Press", "", R.drawable.chest_6_lying_machine_chest_press))
        arrayList.add(Model("Flat Smith Machine Chest Press", "", R.drawable.chest_7_flat_smith_machine_chest_press))
        arrayList.add(Model("One Arm Flat Dumbbell Chest Press", "", R.drawable.chest_8_one_arm_flat_dumbbell_chest_press))
        arrayList.add(Model("Seated Machine Chest Press", "", R.drawable.chest_9_seated_machine_chest_press))
        arrayList.add(Model("Straight Arm Dumbbell Pullover", "", R.drawable.chest_10_straight_arm_dumbbell_pullover))
        arrayList.add(Model("Decline Barbell Chest Press", "", R.drawable.chest_11_decline_barbell_chest_press))
        arrayList.add(Model("Decline Dumbbell Chest Press", "", R.drawable.chest_12_decline_dumbbell_chest_press))
        arrayList.add(Model("Decline Smith Machine Chest Press", "", R.drawable.chest_13_decline_smith_machine_chest_press))
        arrayList.add(Model("Incline Dumbbell Fly", "", R.drawable.chest_14_incline_dumbbell_fly))
        arrayList.add(Model("Flat Dumbbell Fly", "", R.drawable.chest_15_flat_dumbbell_fly))
        arrayList.add(Model("Sven Press", "", R.drawable.chest_16_svend_press))
        arrayList.add(Model("Pec Deck", "", R.drawable.chest_17_pec_deck))
        arrayList.add(Model("Seated Pec Fly Machine", "", R.drawable.chest_18_seated_pec_fly_machine))
        arrayList.add(Model("Decline Cable Fly", "", R.drawable.chest_19_decline_cable_fly))
        arrayList.add(Model("Flat Cable Fly", "", R.drawable.chest_20_flat_cable_fly))
        arrayList.add(Model("Incline Cable Fly", "", R.drawable.chest_21_incline_cable_fly))
        arrayList.add(Model("Wide Hand Push Up", "", R.drawable.chest_22_wide_hand_push_up))
        arrayList.add(Model("Decline Push Ups", "", R.drawable.chest_23_decline_push_up))
        arrayList.add(Model("Diamond Push Ups", "", R.drawable.chest_24_diamond_push_ups))
        arrayList.add(Model("Narrow Hand Push Ups", "", R.drawable.chest_25_narrow_hand_push_ups))
        arrayList.add(Model("Close Grip Dumbbell Push Ups", "", R.drawable.chest_26_close_grip_dumbbell_push_ups))
        arrayList.add(Model("Single Arm Medicine Ball Push Ups", "", R.drawable.chest_27_single_arm_medicine_ball_push_up))
        arrayList.add(Model("Bosu Ball Push Ups", "", R.drawable.chest_28_bosu_ball_push_ups))
        arrayList.add(Model("Body Ups", "", R.drawable.chest_29_body_ups))
        arrayList.add(Model("Stability Ball Decline Push Ups", "", R.drawable.chest_30_stability_ball_decline_push_ups))
        arrayList.add(Model("Isometric Wipers", "", R.drawable.chest_31_isometric_wipers))
        arrayList.add(Model("Chest Cable Crossovers", "", R.drawable.chest_32_chest_cable_crossovers))
        arrayList.add(Model("Low Cable Pec Fly", "", R.drawable.chest_33_low_cable_pec_fly))
        arrayList.add(Model("Middle Cable Pec Fly", "", R.drawable.chest_34_middle_cable_pec_fly))
        arrayList.add(Model("Smith Machine Push Ups", "", R.drawable.chest_35_smith_machine_push_ups))
        arrayList.add(Model("Chest Dips", "", R.drawable.chest_36_chest_dips))
        arrayList.add(Model("Burpees", "", R.drawable.chest_37_burpees))
        arrayList.add(Model("Narrow Hand Push Ups", "", R.drawable.chest_38_narrow_hand_push_ups))
        arrayList.add(Model("Spiderman Push Ups", "", R.drawable.chest_39_spiderman_push_ups))
        arrayList.add(Model("Kick Throughs", "", R.drawable.chest_40_kick_throughs))
        arrayList.add(Model("Clock Push Ups", "", R.drawable.chest_41_clock_push_ups))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}