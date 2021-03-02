package com.zairussalamdev.pokebox.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zairussalamdev.pokebox.R
import com.zairussalamdev.pokebox.ui.adapter.PokemonAdapter
import com.zairussalamdev.pokebox.utils.DummyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonList = DummyData.generatePokemonData()
        val rvPokemon = findViewById<RecyclerView>(R.id.rv_pokemon)
        with(rvPokemon) {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = PokemonAdapter(pokemonList) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.POKEMON_EXTRA, it)
                startActivity(intent)
            }
        }
    }

}