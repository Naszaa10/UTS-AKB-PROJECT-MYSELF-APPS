package com.nasza.myselfapps

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     kelas : PEM-ANDRO 3
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentFirst()
            1 -> FragmentSecond()
            else -> FragmentThird()
        }
    }
}