package com.zairussalamdev.pokebox.ui

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.zairussalamdev.pokebox.R
import com.zairussalamdev.pokebox.utils.Color

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val hero = findViewById<View>(R.id.hero)
        val btnBack = findViewById<ImageButton>(R.id.profile_back)

        val color = Color.generateRandomColor(this)

        hero.setBackgroundColor(color)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            with(window) {
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                statusBarColor = color
            }
        }
        btnBack.setOnClickListener { super.onBackPressed() }
    }
}