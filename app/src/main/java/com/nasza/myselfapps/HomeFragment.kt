package com.nasza.myselfapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     kelas : PEM-ANDRO 3
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home
            , container, false)
    }
}
