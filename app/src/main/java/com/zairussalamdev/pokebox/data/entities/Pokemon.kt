package com.zairussalamdev.pokebox.data.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pokemon(
    val id: Int,
    val name: String,
    val species: String,
    val types: List<String>,
    val height: Double,
    val weight: Double,
    val image: String,
    val description: String
) : Parcelable