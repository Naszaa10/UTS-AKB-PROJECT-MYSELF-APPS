package com.nasza.myselfapps

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
class MusicAdapter(private val musicList: List<Music>) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    inner class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textTitle)
        val urlTextView: TextView = itemView.findViewById(R.id.textUrl)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_music, parent, false)
        return MusicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val currentItem = musicList[position]
        holder.titleTextView.text = currentItem.title
        holder.urlTextView.text = currentItem.youtubeUrl

        holder.itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(currentItem.youtubeUrl))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = musicList.size
}


