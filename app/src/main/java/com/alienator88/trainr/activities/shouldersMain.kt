package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.shouldersAdapter
import kotlinx.android.synthetic.main.rv_main.*


class shouldersMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Shoulders"
        val arrayList = ArrayList<Model>()
        val myAdapter = shouldersAdapter(arrayList, this)

        arrayList.add(Model("Seated Smith Machine Shoulder Press", "", R.drawable.shoulders_1_seated_smith_machine_shoulder_press))
        arrayList.add(Model("Seated Smith Machine Shoulder Press", "", R.drawable.shoulders_2_seated_shoulder_press_machine))
        arrayList.add(Model("Seated Smith Machine Shoulder Press", "", R.drawable.shoulders_3_seated_barbell_shoulder_press))
        arrayList.add(Model("Seated Smith Machine Shoulder Press", "", R.drawable.shoulders_4_standing_smith_macine_shoulder_press))
        arrayList.add(Model("Seated Smith Machine Shoulder Press", "", R.drawable.shoulders_5_seated_dumbbell_shoulder_press))
        arrayList.add(Model("Seated One Arm Dumbbell Shoulder Press", "", R.drawable.shoulders_6_seated_one_arm_dumbbell_shoulder_press))
        arrayList.add(Model("Standing Overhead EZ Bar Press", "", R.drawable.shoulders_7_standing_overhead_ez_bar_press))
        arrayList.add(Model("Standing Overhead Barbell Press", "", R.drawable.shoulders_8_standing_overhead_barbell_press))
        arrayList.add(Model("Standing Dumbbell Shoulder Press", "", R.drawable.shoulders_9_standing_dumbbell_shoulder_press))
        arrayList.add(Model("Supported Standing One Arm Dumbbell Shoulder Press", "", R.drawable.shoulders_10_supported_standing_one_arm_dumbbell_shoulder_press))
        arrayList.add(Model("Standing One Arm Dumbbell Shoulder Press", "", R.drawable.shoulders_11_standing_one_arm_dumbbell_shoulder_press))
        arrayList.add(Model("Seated Dumbbell Lateral Raises", "", R.drawable.shoulders_12_seated_dumbbell_lateral_raises))
        arrayList.add(Model("Standing Dumbbell Lateral Raises", "", R.drawable.shoulders_13_standing_dumbbell_lateral_raises))
        arrayList.add(Model("One Arm Standing Dumbbell Lateral Raises", "", R.drawable.shoulders_14_one_arm_standing_dumbbell_lateral_raises))
        arrayList.add(Model("Supported Standing One Arm Dumbbell Lateral Raises", "", R.drawable.shoulders_15_supported_standing_one_arm_dumbbell_lateral_raises))
        arrayList.add(Model("Standing One Arm Cable Lateral Raises", "", R.drawable.shoulders_16_standing_one_arm_cable_lateral_raises))
        arrayList.add(Model("Machine Lateral Raises", "", R.drawable.shoulders_17_machine_lateral_raises))
        arrayList.add(Model("Lying Dumbbell Lateral Raises", "", R.drawable.shoulders_18_lying_dumbbell_lateral_raises))
        arrayList.add(Model("Standing Upright One Arm Dumbbell Shoulder Rotation", "", R.drawable.shoulders_19_standing_upright_one_arm_dumbbell_shoulder_rotation))
        arrayList.add(Model("Dumbbell Scaption", "", R.drawable.shoulders_20_dumbbell_scaption))
        arrayList.add(Model("Seated Bent Over Lateral Raises", "", R.drawable.shoulders_21_seated_bent_over_lateral_raises))
        arrayList.add(Model("Standing Bent Over Lateral Raises", "", R.drawable.shoulders_22_standing_bent_over_lateral_raises))
        arrayList.add(Model("Standing Cable Bent Over Lateral Raises", "", R.drawable.shoulders_23_standing_cable_bent_over_lateral_raises))
        arrayList.add(Model("Standing Cable Rear Delt Fly", "", R.drawable.shoulders_24_standing_cable_rear_delt_fly))
        arrayList.add(Model("Seated Reverse Fly Vertical Handles", "", R.drawable.shoulders_25_seated_reverse_fly_vertical_handles))
        arrayList.add(Model("Seated Reverse Fly Horizontal Handles", "", R.drawable.shoulders_26_seated_reverse_fly_horizontal_handles))
        arrayList.add(Model("Standing Two Arm Dumbbell Front Raises", "", R.drawable.shoulders_27_standing_two_arm_dumbbell_front_raises))
        arrayList.add(Model("Standing One Arm Cable Front Raises", "", R.drawable.shoulders_28_standing_one_arm_cable_front_raises))
        arrayList.add(Model("Standing Barbell Front Raises", "", R.drawable.shoulders_29_standing_barbell_front_raises))
        arrayList.add(Model("Standing Alternate Vertical Dumbbell Front Raises", "", R.drawable.shoulders_30_standing_alternate_vertical_dumbbell_front_raises))
        arrayList.add(Model("Standing Alternate Dumbbell Front Raises", "", R.drawable.shoulders_31_standing_alternate_dumbbell_front_raises))
        arrayList.add(Model("Standing Dumbbell Front Raises", "", R.drawable.shoulders_32_standing_dumbbell_front_raises))
        arrayList.add(Model("Standing Two Arm Cable Front Raises", "", R.drawable.shoulders_33_standing_two_arm_cable_front_raises))
        arrayList.add(Model("Seated Alternate Dumbbell Front Raises", "", R.drawable.shoulders_34_seated_alternate_dumbbell_front_raises))
        arrayList.add(Model("Side Laterals To Front Raise", "", R.drawable.shoulders_35_side_laterals_to_front_raise))
        arrayList.add(Model("Standing Plate Presses", "", R.drawable.shoulders_36_standing_plate_presses))
        arrayList.add(Model("Standing Plate Front Raises", "", R.drawable.shoulders_37_standing_plate_front_raises))
        arrayList.add(Model("Standing Bus Drivers", "", R.drawable.shoulders_38_standing_bus_drivers))
        arrayList.add(Model("Standing Cable Rear Delt Rope Pulls", "", R.drawable.shoulders_39_standing_cable_rear_delt_rope_pulls))
        arrayList.add(Model("Standing Front Barbell Shrugs", "", R.drawable.shoulders_40_standing_front_barbell_shrugs))
        arrayList.add(Model("Standing Rear Barbell Shrugs", "", R.drawable.shoulders_41_standing_rear_barbell_shrugs))
        arrayList.add(Model("Lever Shrugs", "", R.drawable.shoulders_42_lever_shrugs))
        arrayList.add(Model("Standing Dumbbell Shrugs", "", R.drawable.shoulders_43_standing_dumbbell_shrugs))
        arrayList.add(Model("Bench Press Machine Shrugs", "", R.drawable.shoulders_44_bench_press_machine_shrugs))
        arrayList.add(Model("Standing Back Smith Machine Shrugs", "", R.drawable.shoulders_45_standing_back_smith_machine_shrugs))
        arrayList.add(Model("Standing Front Smith Machine Shrugs", "", R.drawable.shoulders_46_standing_front_smith_machine_shrugs))
        arrayList.add(Model("Standing Upright Rows", "", R.drawable.shoulders_47_standing_upright_rows))
        arrayList.add(Model("Standing Narrow Grip Upright Rows", "", R.drawable.shoulders_48_standing_narrow_grip_upright_rows))
        arrayList.add(Model("Standing Cable Upright Row", "", R.drawable.shoulders_49_standing_cable_upright_row))
        arrayList.add(Model("Narrow Grip Smith Machine Upright Row", "", R.drawable.shoulders_50_narrow_grip_smith_machine_upright_row))
        arrayList.add(Model("Handstand Pushups", "", R.drawable.shoulders_51_handstand_pushups))
        arrayList.add(Model("Battle Ropes", "", R.drawable.shoulders_52_battle_ropes))
        arrayList.add(Model("Barbell Clean and Press", "", R.drawable.shoulders_53_barbell_clean_and_press))








        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}