package com.example.marvel.data.response


import com.google.gson.annotations.SerializedName

data class FirstItem(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?
)