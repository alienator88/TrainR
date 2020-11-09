package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.legsAdapter
import kotlinx.android.synthetic.main.rv_main.*


class legsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Legs"
        val arrayList = ArrayList<Model>()
        val myAdapter = legsAdapter(arrayList, this)


        arrayList.add(Model("Barbell Back Squats", "", R.drawable.legs_1_barbell_back_squats))
        arrayList.add(Model("Barbell Front Squats", "", R.drawable.legs_2_barbell_front_squats))
        arrayList.add(Model("Inverted Smith Machine Leg Press", "", R.drawable.legs_3_inverted_smith_machine_leg_press))
        arrayList.add(Model("Smith Machine Split Squat", "", R.drawable.legs_4_smith_machine_split_squat))
        arrayList.add(Model("Single Leg Smith Machine Split Squat", "", R.drawable.legs_5_single_leg_smith_machine_split_squat))
        arrayList.add(Model("Machine Chair Squats", "", R.drawable.legs_6_smith_machine_chair_squats))
        arrayList.add(Model("Single Leg Dumbbell Split Squat", "", R.drawable.legs_7_single_leg_dumbbell_split_squat))
        arrayList.add(Model("Single Leg Barbell Split Squat", "", R.drawable.legs_8_single_leg_barbell_split_squat))
        arrayList.add(Model("Dumbbell Pistol Squat", "", R.drawable.legs_9_dumbbell_pistol_squat))
        arrayList.add(Model("Barbell Overhead Squats", "", R.drawable.legs_10_barbell_overhead_squats))
        arrayList.add(Model("Barbell Bench Front Squats", "", R.drawable.legs_11_barbell_bench_front_squats))
        arrayList.add(Model("Sumo Squats", "", R.drawable.legs_12_sumo_squats))
        arrayList.add(Model("Goblet Squats", "", R.drawable.legs_13_goblet_squats))
        arrayList.add(Model("Bodyweight Jump Squats", "", R.drawable.legs_14_bodyweight_jump_squats))
        arrayList.add(Model("Wall Sits", "", R.drawable.legs_15_wall_sits))
        arrayList.add(Model("Dumbbell Lunge Step Ups", "", R.drawable.legs_16_dumbbell_lunge_step_ups))
        arrayList.add(Model("Leg Press Machine", "", R.drawable.legs_17_leg_press_machine))
        arrayList.add(Model("Lying Machine Squat", "", R.drawable.legs_18_lying_machine_squat))
        arrayList.add(Model("Seated Machine Squats", "", R.drawable.legs_19_seated_machine_squats))
        arrayList.add(Model("Barbell Lunges", "", R.drawable.legs_20_barbell_lunges))
        arrayList.add(Model("Dumbbell Lunges", "", R.drawable.legs_21_dumbbell_lunges))
        arrayList.add(Model("Barbell Lunge Step Ups", "", R.drawable.legs_22_barbell_lunge_step_ups))
        arrayList.add(Model("Leg Extensions", "", R.drawable.legs_23_leg_extensions))
        arrayList.add(Model("Seated Hamstring Curl", "", R.drawable.legs_24_seated_hamstring_curl))
        arrayList.add(Model("Lying Hamstring Curl", "", R.drawable.legs_25_lying_hamstring_curls))
        arrayList.add(Model("Barbell Deadlifts", "", R.drawable.legs_26_barbell_deadlifts))
        arrayList.add(Model("Barbell Stiff Leg Deadlifts", "", R.drawable.legs_27_barbell_stiff_leg_deadlifts))
        arrayList.add(Model("Smith Machine Stiff Leg Deadlifts", "", R.drawable.legs_28_smith_machine_stiff_leg_deadlifts))
        arrayList.add(Model("Dumbbell Deadlifts", "", R.drawable.legs_29_dumbbell_deadlifts))
        arrayList.add(Model("Dumbbell Stiff Leg Deadlifts", "", R.drawable.legs_30_dumbbell_stiff_leg_deadlifts))
        arrayList.add(Model("Lever Deadlifts", "", R.drawable.legs_31_lever_deadlifts))
        arrayList.add(Model("Sumo Deadlift", "", R.drawable.legs_32_sumo_deadlift))
        arrayList.add(Model("Barbell Good Mornings", "", R.drawable.legs_33_barbell_good_mornings))
        arrayList.add(Model("Mountain Climbers", "", R.drawable.legs_34_mountain_climbers))
        arrayList.add(Model("Glute Ham Raise", "", R.drawable.legs_35_glute_ham_raise))
        arrayList.add(Model("Barbell Hip Thrust", "", R.drawable.legs_36_barbell_hip_thrust))
        arrayList.add(Model("Glute Bridge", "", R.drawable.legs_37_glute_bridge))
        arrayList.add(Model("Thigh Adductor", "", R.drawable.legs_38_thigh_adductor))
        arrayList.add(Model("Thigh Abductor", "", R.drawable.legs_39_thigh_abductor))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}