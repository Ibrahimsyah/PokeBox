package com.zairussalamdev.pokebox.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zairussalamdev.pokebox.R
import com.zairussalamdev.pokebox.data.entities.Pokemon
import kotlin.random.Random

class PokemonAdapter(
    private val pokemonList: List<Pokemon>,
    private val listener: (Pokemon) -> Unit
) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    inner class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindPokemon(pokemon: Pokemon, listener: (Pokemon) -> Unit) {
            with(itemView) {
                val pokemonCard = findViewById<CardView>(R.id.pokemon_card)
                val pokemonName = findViewById<TextView>(R.id.pokemon_name)
                val pokemonImage = findViewById<ImageView>(R.id.pokemon_image)
                val pokemonTypeRv = findViewById<RecyclerView>(R.id.pokemon_rv_types)

                val colors = context.resources.getIntArray(R.array.tile_colors)
                val cardColor = colors[Random.nextInt(0, colors.size)]
                pokemonCard.setCardBackgroundColor(cardColor)

                pokemonName.text = pokemon.name
                Glide.with(context).load(pokemon.image).into(pokemonImage)
                with(pokemonTypeRv) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = PokemonTypeAdapter(pokemon.types)
                }
                setOnClickListener { listener(pokemon) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bindPokemon(pokemonList[position], listener)
    }

    override fun getItemCount(): Int = pokemonList.size
}