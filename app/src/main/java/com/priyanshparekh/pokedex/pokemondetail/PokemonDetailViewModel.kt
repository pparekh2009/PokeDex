package com.priyanshparekh.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.priyanshparekh.pokedex.data.remote.responses.Pokemon
import com.priyanshparekh.pokedex.repository.PokemonRepository
import com.priyanshparekh.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName:String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}