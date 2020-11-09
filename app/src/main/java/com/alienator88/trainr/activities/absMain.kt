package com.alienator88.trainr.activities

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alienator88.trainr.models.Model
import com.alienator88.trainr.R
import com.alienator88.trainr.adapters.absAdapter
import kotlinx.android.synthetic.main.rv_main.*


class absMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Abs"
        val arrayList = ArrayList<Model>()
        val myAdapter = absAdapter(arrayList, this)


        arrayList.add(Model("Tuck Crunch", "", R.drawable.abs_1_tuck_crunch))
        arrayList.add(Model("Seated Ab Crunch Machine", "", R.drawable.abs_2_seated_ab_crunch_machine))
        arrayList.add(Model("Bench V-Sit Crunches", "", R.drawable.abs_3_bench_vsit_crunches))
        arrayList.add(Model("Ab Crunches", "", R.drawable.abs_4_ab_crunches))
        arrayList.add(Model("Reverse Crunch", "", R.drawable.abs_5_reverse_crunch))
        arrayList.add(Model("Sit Ups", "", R.drawable.abs_6_sit_ups))
        arrayList.add(Model("Decline Reverse Crunch", "", R.drawable.abs_7_decline_reverse_crunch))
        arrayList.add(Model("Oblique Crunches", "", R.drawable.abs_8_oblique_crunches))
        arrayList.add(Model("Raised Legs Cross Body Crunches", "", R.drawable.abs_9_raised_legs_cross_body_crunches))
        arrayList.add(Model("Decline Sit Ups", "", R.drawable.abs_10_decline_sit_ups))
        arrayList.add(Model("Decline Crunch", "", R.drawable.abs_11_decline_crunch))
        arrayList.add(Model("Decline Crunch With Twist", "", R.drawable.abs_12_decline_crunch_with_twist))
        arrayList.add(Model("Stability Ball Crunches", "", R.drawable.abs_13_stability_ball_crunches))
        arrayList.add(Model("Otis Up", "", R.drawable.abs_14_otis_up))
        arrayList.add(Model("Jack Knife Sit Ups", "", R.drawable.abs_15_jack_knife_sit_ups))
        arrayList.add(Model("Air Bike", "", R.drawable.abs_16_air_bike))
        arrayList.add(Model("Lying Ankle Taps", "", R.drawable.abs_17_lying_ankle_taps))
        arrayList.add(Model("Ab Wheel Roll Outs", "", R.drawable.abs_18_ab_wheel_roll_outs))
        arrayList.add(Model("Lying Flat Bench Leg Raises", "", R.drawable.abs_19_lying_flat_bench_leg_raises))
        arrayList.add(Model("Lying Flat Bench Knee Raises", "", R.drawable.abs_20_lying_flat_bench_knee_raises))
        arrayList.add(Model("Assisted Lying Leg Raise", "", R.drawable.abs_21_assisted_lying_leg_raise))
        arrayList.add(Model("Lying Leg Raise", "", R.drawable.abs_22_lying_leg_raise))
        arrayList.add(Model("Stability Ball Pull-Ins", "", R.drawable.abs_23_stability_ball_pull_ins))
        arrayList.add(Model("Kneeling Cable Crunch", "", R.drawable.abs_24_kneeling_cable_crunch))
        arrayList.add(Model("Landmine 180s", "", R.drawable.abs_25_landmine_180s))
        arrayList.add(Model("Knee Raises", "", R.drawable.abs_26_knee_raises))
        arrayList.add(Model("Bench Side Bends", "", R.drawable.abs_27_bench_side_bends))
        arrayList.add(Model("Dumbbell Side Bend", "", R.drawable.abs_28_dumbbell_side_bend))
        arrayList.add(Model("Hanging Ab Windmills", "", R.drawable.abs_29_hanging_ab_windmills))
        arrayList.add(Model("Hanging Leg Raises", "", R.drawable.abs_30_hanging_leg_raises))
        arrayList.add(Model("Oblique Raises", "", R.drawable.abs_31_oblique_raises))
        arrayList.add(Model("Side Plank", "", R.drawable.abs_32_side_plank))
        arrayList.add(Model("Elbow Plank", "", R.drawable.abs_33_elbow_plank))
        arrayList.add(Model("Hollow Holds", "", R.drawable.abs_34_hollow_holds))
        arrayList.add(Model("Prone Plank", "", R.drawable.abs_35_prone_plank))
        arrayList.add(Model("Leg Raise And Hold", "", R.drawable.abs_36_leg_raise_and_hold))
        arrayList.add(Model("Flutter Kicks", "", R.drawable.abs_37_flutter_kicks))
        arrayList.add(Model("Dead Bug", "", R.drawable.abs_38_dead_bug))
        arrayList.add(Model("Bird Dog", "", R.drawable.abs_39_bird_dog))
        arrayList.add(Model("Wipers", "", R.drawable.abs_40_wipers))
        arrayList.add(Model("Bosu Ball Crunch", "", R.drawable.abs_41_bosu_ball_crunch))
        arrayList.add(Model("Medicine Ball Russian Twists", "", R.drawable.abs_42_medicine_ball_russian_twists))
        arrayList.add(Model("Half Wipers", "", R.drawable.abs_43_half_wipers))
        arrayList.add(Model("Side Plank Pulse", "", R.drawable.abs_44_side_plank_pulse))
        arrayList.add(Model("Cocoons", "", R.drawable.abs_45_cocoons))







        rec1.layoutManager = LinearLayoutManager(this)
        rec1.adapter = myAdapter




    }
}