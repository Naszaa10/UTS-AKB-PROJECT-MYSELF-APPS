package com.nasza.myselfapps

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class GaleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter

    // Daftar ID resource gambar
    private val imageIds = listOf(
        R.drawable.profile,
        R.drawable.profile_image,
        R.drawable.ic_adrian,
        R.drawable.ic_idan,
        R.drawable.ic_liq,
        R.drawable.gal1,
        R.drawable.gal2,
        R.drawable.gal3,
        R.drawable.gal4,
        R.drawable.gal5,
        R.drawable.gal6,
        // Tambahkan ID resource gambar lainnya
    )

    override fun onAttach(context: Context) {
        super.onAttach(context)
        adapter = ImageAdapter(context, imageIds)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_galery, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        // Set layout manager sebagai GridLayoutManager dengan 3 kolom
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)

        // Set adapter ke RecyclerView
        recyclerView.adapter = adapter

        return view
    }
}
