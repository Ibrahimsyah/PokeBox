package com.zairussalamdev.pokebox.utils

import com.zairussalamdev.pokebox.data.entities.Pokemon

object DummyData {
    fun generatePokemonData(): List<Pokemon> {
        val pokemonList = mutableListOf<Pokemon>()
        pokemonList.add(
            Pokemon(
                1,
                "Bulbasaur",
                "Seed",
                mutableListOf("Grass", "Poison"),
                2.04,
                15.2,
                "https://cdn.traction.one/pokedex/pokemon/1.png",
                "While it is young, it uses the nutrients that are stored in the seeds on its back in order to grow."
            )
        )
        pokemonList.add(
            Pokemon(
                2,
                "Ivysaur",
                "Seed",
                mutableListOf("Grass", "Poison"),
                3.03,
                28.7,
                "https://cdn.traction.one/pokedex/pokemon/2.png",
                "The bulb on its back grows as it absorbs nutrients. The bulb gives off a pleasant aroma when it blooms."
            )
        )
        pokemonList.add(
            Pokemon(
                3,
                "Venusaur",
                "Seed",
                mutableListOf("Grass", "Poison"),
                6.07,
                220.5,
                "https://cdn.traction.one/pokedex/pokemon/3.png",
                "As it warms itself and absorbs the sunlight, its flower petals release a pleasant fragrance."
            )
        )
        pokemonList.add(
            Pokemon(
                4,
                "Charmander",
                "Lizard",
                mutableListOf("Fire"),
                2.0,
                18.7,
                "https://cdn.traction.one/pokedex/pokemon/4.png",
                "If it\'s healthy, the flame on the tip of its tail will burn vigorously, even if it gets a bit wet."
            )
        )
        pokemonList.add(
            Pokemon(
                5,
                "Charmeleon",
                "Flame",
                mutableListOf("Fire"),
                3.07,
                41.9,
                "https://cdn.traction.one/pokedex/pokemon/5.png",
                "If it becomes agitated during battle, it spouts intense flames, incinerating its surroundings."
            )
        )
        pokemonList.add(
            Pokemon(
                6,
                "Charizard",
                "Flame",
                mutableListOf("Fire", "Flying"),
                5.07,
                199.5,
                "https://cdn.traction.one/pokedex/pokemon/6.png",
                "It uses its wings to fly high. The temperature of its fire increases as it gains experience in battle."
            )
        )
        pokemonList.add(
            Pokemon(
                7,
                "Squirtle",
                "Tiny Turtle",
                mutableListOf("Water"),
                1.08,
                19.8,
                "https://cdn.traction.one/pokedex/pokemon/7.png",
                "When it feels threatened, it draws its legs inside its shell and sprays water from its mouth."
            )
        )
        pokemonList.add(
            Pokemon(
                8,
                "Wartortle",
                "Turtle",
                mutableListOf("Water"),
                3.03,
                49.6,
                "https://cdn.traction.one/pokedex/pokemon/8.png",
                "Its long, furry tail is a symbol of longevity, making it quite popular among older people."
            )
        )
        pokemonList.add(
            Pokemon(
                9,
                "Blastoise",
                "Shellfish",
                mutableListOf("Water"),
                5.03,
                188.5,
                "https://cdn.traction.one/pokedex/pokemon/9.png",
                "It firmly plants its feet on the ground before shooting water from the jets on its back."
            )
        )
        pokemonList.add(
            Pokemon(
                10,
                "Caterpie",
                "Worm",
                mutableListOf("Bug"),
                1.0,
                6.4,
                "https://cdn.traction.one/pokedex/pokemon/10.png",
                "It crawls into foliage where it camouflages itself among leaves that are the same color as its body."
            )
        )
        return pokemonList
    }
}