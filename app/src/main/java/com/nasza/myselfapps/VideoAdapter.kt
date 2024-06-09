package com.nasza.myselfapps

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class VideoAdapter(private val videoList: List<Video>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textTitle)
        val thumbnailImageView: ImageView = itemView.findViewById(R.id.imageThumbnail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_video, parent, false)
        return VideoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val currentItem = videoList[position]
        holder.titleTextView.text = currentItem.title
        Glide.with(holder.itemView.context)
            .load(currentItem.thumbnailUrl)
            .placeholder(R.drawable.music) // Gambar placeholder saat memuat
            .into(holder.thumbnailImageView)

        holder.itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(currentItem.youtubeUrl))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = videoList.size
}

