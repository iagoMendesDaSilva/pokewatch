package com.iago.pokewatch.utils

import androidx.compose.ui.graphics.Color
import com.iago.pokewatch.R
import com.iago.pokewatch.theme.*

class FormatPokemon {

    companion object {

        fun getColorByType(type: String?): Color {
            val color = when (type?.toLowerCase()) {
                "grass"->grass
                "bug" -> bug
                "fire" -> fire
                "water" -> water
                "fighting" -> fighting
                "normal" -> normal
                "electric" -> electric
                "psychic" -> psychic
                "poison" -> poison
                "ghost" -> ghost
                "ground", "ground" -> ground
                "rock", "rock" -> rock
                "ice", "ice" -> ice
                "flying", "flying" -> flying
                "dragon", "dragon" -> dragon
                "steel", "steel" -> steel
                "fairy" -> fairy
                "dark" -> dark
                else -> BackGroundDark
            }
            return color
        }

        fun getIcon(type: String?): Int? {
            val icon = when (type?.toLowerCase()) {
                "grass"->R.drawable.grass
                "bug" -> R.drawable.bug
                "fire" -> R.drawable.fire
                "water" -> R.drawable.water
                "fighting" -> R.drawable.fighting
                "normal" -> R.drawable.normal
                "electric" -> R.drawable.eletric
                "psychic" -> R.drawable.psychic
                "poison" -> R.drawable.poison
                "ghost" -> R.drawable.ghost
                "ground", "ground" -> R.drawable.ground
                "rock", "rock" -> R.drawable.rock
                "ice", "ice" -> R.drawable.ice
                "flying", "flying" -> R.drawable.flying
                "dragon", "dragon" -> R.drawable.dragon
                "steel", "steel" -> R.drawable.steel
                "fairy" -> R.drawable.fairy
                "dark" -> R.drawable.dark
                else -> null
            }
            return icon
        }
    }

}