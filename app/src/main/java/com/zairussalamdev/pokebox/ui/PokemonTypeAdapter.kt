package com.zairussalamdev.pokebox.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zairussalamdev.pokebox.R

class PokemonTypeAdapter(
    private val types: List<String>
) : RecyclerView.Adapter<PokemonTypeAdapter.TypeViewHolder>() {

    inner class TypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindType(type: String) {
            val pokemonType = itemView.findViewById<TextView>(R.id.pokemon_type)
            pokemonType.text = type
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon_type, parent, false)
        return TypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
        holder.bindType(types[position])
    }

    override fun getItemCount(): Int = types.size

}