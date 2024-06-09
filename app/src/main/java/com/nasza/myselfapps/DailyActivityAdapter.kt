package com.nasza.myselfapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     kelas : PEM-ANDRO 3
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->

class DailyActivityAdapter(private val activities: List<DailyActivityModel>) : RecyclerView.Adapter<DailyActivityAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.activity_image)
        val titleView: TextView = itemView.findViewById(R.id.activity_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_daily_activity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val activity = activities[position]
        holder.imageView.setImageResource(activity.imageResId)
        holder.titleView.text = activity.title
    }

    override fun getItemCount(): Int = activities.size
}


