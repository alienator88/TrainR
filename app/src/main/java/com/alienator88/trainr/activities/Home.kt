package com.alienator88.trainr.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.alienator88.trainr.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_bmi.view.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.custompopup_main.view.*
import kotlinx.android.synthetic.main.namepopup.view.*
import java.text.SimpleDateFormat
import java.util.*


class Home : AppCompatActivity() {

    //region Pull color and category map from BMIUtils class
    companion object {
        private val CATEGORY_CODE_MAP: HashMap<Int, String> = HashMap(5)

        init {
            CATEGORY_CODE_MAP.put(R.color.bmi_blue, "Underweight")
            CATEGORY_CODE_MAP.put(R.color.bmi_green, "Healthy")
            CATEGORY_CODE_MAP.put(R.color.bmi_yellow, "Overweight")
            CATEGORY_CODE_MAP.put(R.color.bmi_orange, "Obese")
            CATEGORY_CODE_MAP.put(R.color.bmi_red, "Extremely Obese")
        }
    }
    //endregion


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //region Variables
        val sp = getSharedPreferences("SP_Data", Context.MODE_PRIVATE)
        val message = sp.getString("BMI", "")
        val nameSP = sp.getString("NAME", "")
        val categoryname = sp.getString("CATEGORY", "")
        val colorcode = sp.getInt("COLOR_CODE", 0)
        //endregion

        //region Date
        val date_n = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(Date())
        datetxt.text = date_n
        //endregion

        //region CheckBMI and name on load
        if (nameSP.isNullOrEmpty()) {
            welcometxt.text = "Tap here to set your name"
        } else {
            welcometxt.text = "Welcome, " + nameSP
        }

        if (message.isNullOrEmpty()) {
            mainBMI.text =
                "Your BMI has not been calculated yet, tap here"
        } else {
            mainBMI.text = "Your current BMI is: " + message
        }

        if (categoryname.isNullOrEmpty()) {
            categoryTv.text = "No health category calculated yet"
        } else {
            categoryTv.text = categoryname
            categoryTv.setTextColor(ContextCompat.getColor(this, colorcode))
        }
        //endregion

        //region Click Listeners

        welcomename.setOnClickListener {
            val dialogname = BottomSheetDialog(this)
            val bottomSheetname = layoutInflater.inflate(R.layout.namepopup, null)
            bottomSheetname.nameBtn.setOnClickListener {
                val editorname = sp.edit()
                //editorname.clear()
                editorname.putString("NAME", bottomSheetname.nameEt.text.toString().trim())
                editorname.apply()
                welcometxt.text = "Welcome, " + bottomSheetname.nameEt.text.toString().trim()
                dialogname.cancel()
            }
            dialogname.setContentView(bottomSheetname)
            dialogname.show()
        }

        //Workouts
        workoutbtn.setOnClickListener{
            val dialog = BottomSheetDialog(this)
            val bottomSheetwrk = layoutInflater.inflate(R.layout.custompopup_main, null)
                bottomSheetwrk.forearms.setOnClickListener {
                    val intent = Intent(this, forearmsMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.cardio.setOnClickListener {
                    val intent = Intent(this, cardioMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.calves.setOnClickListener {
                    val intent = Intent(this, calvesMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.triceps.setOnClickListener {
                    val intent = Intent(this, tricepsMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.biceps.setOnClickListener {
                    val intent = Intent(this, bicepsMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.shoulders.setOnClickListener {
                    val intent = Intent(this, shouldersMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.legs.setOnClickListener {
                    val intent = Intent(this, legsMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.back.setOnClickListener {
                    val intent = Intent(this, backMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.abs.setOnClickListener {
                    val intent = Intent(this, absMain::class.java)
                    startActivity(intent)
                }
                bottomSheetwrk.chest.setOnClickListener {
                    val intent = Intent(this, chestMain::class.java)
                    startActivity(intent)
                }
                dialog.setContentView(bottomSheetwrk)
                dialog.show()

            }

        //BMI Click
        bmiGo.setOnClickListener {

            val dialog = BottomSheetDialog(this)
            val bottomSheet = layoutInflater.inflate(R.layout.activity_bmi, null)


            fun setupSharedPrefs() {
                val weight = Integer.parseInt(bottomSheet.lbsEt.text.toString().trim())
                val heightfeet = Integer.parseInt(bottomSheet.feetEt.text.toString().trim())
                val heightinch = Integer.parseInt(bottomSheet.inchesET.text.toString().trim())
                //val name = bottomSheet.name.text.toString().trim()
                //val booleanvar = switchh.isChecked //if checked then true, else false

                //Edit shared preferences (save data)
                val editor = sp.edit()
                //editor.clear()
                editor.putInt("WEIGHT", weight)
                editor.putInt("HEIGHT_FEET", heightfeet)
                editor.putInt("HEIGHT_INCHES", heightinch)
                //editor.putString("NAME", name)
                //editor.putBoolean("BOOLEAN_VAR", booleanvar)
                editor.apply()
            }

            fun showSharedPrefs() {



                //Get data from shared preferences
                val weightsp = sp.getInt("WEIGHT", 0)
                val heightfeetsp = sp.getInt("HEIGHT_FEET", 0)
                val heightinchsp = sp.getInt("HEIGHT_INCHES", 0)
                //val name = sp.getString("NAME", "")
                //val booleanvar = sp.getBoolean("BOOLEAN_VAR", false)

                val weight = weightsp.toDouble()
                val height = (heightfeetsp.toDouble() * 12) + heightinchsp.toDouble()

                // Calculate bmi
                val bmiDetails = BMIUtils.calculateBMI(weight, height)

                // Fetch the category identifier color code
                val categoryIdentifierColorCode: Int = BMIUtils.getCategoryIdentifier(bmiDetails.second)



                //region Update Views
                fun updateViews(category: String?, colorCode: Int) {
                    //bottomSheet.bmiZone.text = category
                    //bottomSheet.bmiZone.setTextColor(ContextCompat.getColor(this, colorCode))
                    //mainBMI.setTextColor(ContextCompat.getColor(this, colorCode))
                    mainBMI.text = "Your current BMI is: " + bmiDetails.first
                    categoryTv.setTextColor(ContextCompat.getColor(this, colorCode))
                    categoryTv.text = category

                    val editor2 = sp.edit()
                    editor2.putInt("COLOR_CODE", colorCode)
                    editor2.putString("CATEGORY", category)
                    editor2.apply()
                }
                //endregion

                // Update the TextView content
                //bottomSheet.bmiTv.text = "Your BMI is: " + bmiDetails.first

                //Show data in results text view
                //bottomSheet.resultsTv.text = "Height: $heightfeetsp.$heightinchsp ft\nWeight: $weightsp"

                //mainBMI.text = "Your current BMI is: " + bmiDetails.first


                // Update Category TextView's text and background
                updateViews(CATEGORY_CODE_MAP[categoryIdentifierColorCode], categoryIdentifierColorCode)

                //Enter BMI into SharedPreferences
                val editor = sp.edit()
                editor.putString("BMI", bmiDetails.first)
                editor.apply()

            }

            bottomSheet.saveBtn.setOnClickListener {
                if (bottomSheet.lbsEt.text.toString().trim().isEmpty() or bottomSheet.feetEt.text.toString().trim().isEmpty() or bottomSheet.inchesET.text.toString().trim().isEmpty()) {
                    Toast.makeText(this, "Fill in all the fields first", Toast.LENGTH_SHORT).show()
                } else {
                    setupSharedPrefs()
                    showSharedPrefs()
                    dialog.cancel()
                    //Toast.makeText(this, "BMI information has been stored", Toast.LENGTH_SHORT).show()
                }
            }
            
            dialog.setContentView(bottomSheet)
            dialog.show()
        }

        //Info
        infoBtn.setOnClickListener {
            val dialoginfo = BottomSheetDialog(this)
            val bottomSheetinfo = layoutInflater.inflate(R.layout.info, null)
            dialoginfo.setContentView(bottomSheetinfo)
            dialoginfo.show()
        }

        //endregion

    }
}