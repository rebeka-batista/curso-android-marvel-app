package br.com.core.data.repository

import androidx.paging.PagingSource
import br.com.core.domain.model.Character

interface CharactersRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>

}
