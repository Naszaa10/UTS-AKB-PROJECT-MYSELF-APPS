package com.nasza.myselfapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     kelas : PEM-ANDRO 3
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class IntroActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var btnNext: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        viewPager = findViewById(R.id.viewPager)
        btnNext = findViewById(R.id.btnNext)

        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        btnNext.setOnClickListener {
            if (viewPager.currentItem < 2) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}
