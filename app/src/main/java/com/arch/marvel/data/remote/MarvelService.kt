package com.arch.marvel.data.remote

import com.arch.marvel.data.response.character.CharacterResultDto
import com.example.marvel.data.response.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface MarvelService {

    @GET("characters")
    fun getCharacter(): Response<BaseResponse<CharacterResultDto>>

}