package com.zairussalamdev.pokebox.ui

import android.os.Bundle
import android.widget.Toast
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
                Toast.makeText(context, "You clicked ${it.name}!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}