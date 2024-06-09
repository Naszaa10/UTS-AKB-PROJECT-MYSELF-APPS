package com.nasza.myselfapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class MusicFragment : Fragment() {

    private val musicList = listOf(
        Music("HAL - Terima Kasih", "https://www.youtube.com/watch?v=7PqIeA6Sisw"),
        Music("Bernadya - Apa Mungkin", "https://www.youtube.com/watch?v=YIza-jl2Kcs"),
        Music("Bandaneira - Sampai Jadi Debu", "https://www.youtube.com/watch?v=2uT4vDdkFIk&list"),
        Music("Kembali Pulang - Suara Kayu", "https://www.youtube.com/watch?v=WGiCwrwRDro&ab_channel"),

        )

    private val videoList = listOf(
        Video("RIZAL MUK - Reaction", "https://www.youtube.com/embed/kvzaae8Eg70", "https://img.youtube.com/vi/kvzaae8Eg70/maxresdefault.jpg"),
        Video("DHOT DESIGN - GoodBye", "https://www.youtube.com/embed/I2gmSqTjTsA", "https://img.youtube.com/vi/I2gmSqTjTsA/maxresdefault.jpg"),
        Video("NADIA OMARA - Kisah Horor Wawak", "https://www.youtube.com/embed/v3Cu3AfJs-0", "https://img.youtube.com/vi/v3Cu3AfJs-0/maxresdefault.jpg")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewMusic = view.findViewById<RecyclerView>(R.id.recyclerViewMusic)
        recyclerViewMusic.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewMusic.adapter = MusicAdapter(musicList)

        val recyclerViewVideo = view.findViewById<RecyclerView>(R.id.recyclerViewVideo)
        recyclerViewVideo.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewVideo.adapter = VideoAdapter(videoList)
    }
}
