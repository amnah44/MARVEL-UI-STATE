package com.arch.marvel.ui.character

import com.arch.marvel.R
import com.arch.marvel.ui.base.BaseFragment
import com.arch.marvel.databinding.FragmentCharacterBinding

class CharacterFragment : BaseFragment<FragmentCharacterBinding, CharacterViewModel>() {
    override val layoutIdFragment: Int = R.layout.fragment_character
    override val viewModelClass: Class<CharacterViewModel> = CharacterViewModel::class.java

    override fun setup() {
        binding.recyclerSeeAll.adapter = CharacterAdapter(mutableListOf(), viewModel)
    }


}