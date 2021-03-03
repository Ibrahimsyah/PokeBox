package com.zairussalamdev.pokebox.utils

import android.content.Context
import com.zairussalamdev.pokebox.R
import kotlin.random.Random

object Color {
    fun generateRandomColor(context: Context): Int {
        val colors = context.resources.getIntArray(R.array.tile_colors)
        return colors[Random.nextInt(0, colors.size)]
    }
}