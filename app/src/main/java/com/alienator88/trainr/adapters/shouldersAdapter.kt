package com.alienator88.trainr.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils.loadAnimation
import androidx.recyclerview.widget.RecyclerView
import com.alienator88.trainr.R
import com.alienator88.trainr.activities.Details
import com.alienator88.trainr.models.Model
import kotlinx.android.synthetic.main.row.view.*


class shouldersAdapter(val arrayList: ArrayList<Model>, val context: Context) : RecyclerView.Adapter<shouldersAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(Model: Model) {
            itemView.titleTv.text = Model.title
            itemView.descTv.text = Model.desc
            itemView.imageIv.setImageResource(Model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList [position])

        //holder.itemView.imageIv.startAnimation(loadAnimation(context, R.anim.fade_transition))
        holder.itemView.titleTv.startAnimation(loadAnimation(context, R.anim.fade_transition))
        //holder.itemView.descTv.startAnimation(loadAnimation(context, R.anim.fade_transition))

        holder.itemView.setOnClickListener {

            val model = arrayList.get(position)
            var gTitle : String = model.title
            var gDesc : String = model.desc
            var gImage : Int = model.image

            val intent = Intent(context, Details::class.java)
            intent.putExtra("gTitle", gTitle)
            intent.putExtra("gDesc", gDesc)
            intent.putExtra("gImage", gImage)
            context.startActivity(intent)


        }
    }


}