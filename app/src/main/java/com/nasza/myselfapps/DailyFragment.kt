package com.nasza.myselfapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class DailyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Data Kegiatan saya
        val dailyActivities = listOf(
            DailyActivityModel(R.drawable.ic_olahraga, "Lari Pagi "),
            DailyActivityModel(R.drawable.ic_makan, "Sarapah pagi"),
            DailyActivityModel(R.drawable.ic_kuliah, "Berkuliah Mencari Ilmu"),
            DailyActivityModel(R.drawable.ic_nonton, "Menonton Tv / Anime"),
            DailyActivityModel(R.drawable.ic_jalan_jalan, "Jalan-Jalan Menggunakan Motor"),
            DailyActivityModel(R.drawable.ic_game, "Bermain Game"),
            DailyActivityModel(R.drawable.ic_nongkrong, "Nongkrong dengan Teman ")
        )
        // Data Teman
        val friends = listOf(
            FriendModel(R.drawable.ic_adrian, "Adrian Maulana Rizqy"),
            FriendModel(R.drawable.ic_idan, "Wildan Permana"),
            FriendModel(R.drawable.ic_liq, "Faliq Zuldan Akbar"),
            FriendModel(R.drawable.ic_ben, "Beny Yusuf"),
            FriendModel(R.drawable.ic_mor, "Fauzan Fadhil Moricio"),
            FriendModel(R.drawable.ic_bro, "M Hafizh A")
        )

        //Daily Activity RecyclerView
        val dailyActivityRecyclerView = view.findViewById<RecyclerView>(R.id.daily_activity_recyclerview)
        dailyActivityRecyclerView.layoutManager = LinearLayoutManager(context)
        dailyActivityRecyclerView.adapter = DailyActivityAdapter(dailyActivities)

        //Friends RecyclerView
        val friendsRecyclerView = view.findViewById<RecyclerView>(R.id.friends_recyclerview)
        friendsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        friendsRecyclerView.adapter = FriendsAdapter(friends)
    }
}

