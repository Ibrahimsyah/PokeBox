package com.zairussalamdev.pokebox.ui

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zairussalamdev.pokebox.R
import com.zairussalamdev.pokebox.data.entities.Pokemon
import com.zairussalamdev.pokebox.ui.adapter.PokemonTypeAdapter
import com.zairussalamdev.pokebox.utils.Color

class DetailActivity : AppCompatActivity() {
    companion object {
        const val POKEMON_EXTRA = "POKEMON_EXTRA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pokemon: Pokemon? = intent?.getParcelableExtra(POKEMON_EXTRA)
        val color = Color.generateRandomColor(this)

        val detailBackground = findViewById<ScrollView>(R.id.detail_background)
        val detailActionBack = findViewById<ImageView>(R.id.detail_action_back)
        val pokemonTitle = findViewById<TextView>(R.id.pokemon_detail_title)
        val pokemonImage = findViewById<ImageView>(R.id.pokemon_detail_image)
        val pokemonTypes = findViewById<RecyclerView>(R.id.pokemon_detail_types)
        val pokemonDesc = findViewById<TextView>(R.id.pokemon_detail_desc)
        val pokemonSpecies = findViewById<TextView>(R.id.pokemon_detail_species)
        val pokemonHeight = findViewById<TextView>(R.id.pokemon_detail_height)
        val pokemonWeight = findViewById<TextView>(R.id.pokemon_detail_weight)

        detailBackground.setBackgroundColor(color)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            with(window) {
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                statusBarColor = color
            }
        }

        pokemon?.let {
            pokemonTitle.text = it.name
            pokemonDesc.text = it.description
            pokemonSpecies.text = it.species
            pokemonHeight.text = buildString {
                append(it.height)
                append(" Feet")
            }
            pokemonWeight.text = buildString {
                append(it.weight)
                append(" Lbs")
            }
            Glide.with(this).load(it.image).into(pokemonImage)
            with(pokemonTypes) {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                adapter = PokemonTypeAdapter(it.types)
            }
        }

        detailActionBack.setOnClickListener { super.onBackPressed() }
    }
}