package com.arch.marvel.ui.character

import com.arch.marvel.R
import com.example.marvel.data.response.Result
import com.arch.marvel.ui.base.BaseInteractionListener
import com.arch.marvel.ui.base.BaseMarvelAdapter

class CharacterAdapter(
    comicsItem: List<Result>,
    listener: CharacterInteractionListener
) : BaseMarvelAdapter<Result>(comicsItem, listener) {

    override val layoutId: Int = R.layout.item_character

}

interface CharacterInteractionListener : BaseInteractionListener