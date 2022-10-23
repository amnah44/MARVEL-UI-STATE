package com.arch.marvel.data

sealed class NetworkState<out T> {
    object OnLoading : NetworkState<Nothing>()
    data class OnSuccess<T>(val data: T?) : NetworkState<T>()
    data class OnFailure(val message: String?) : NetworkState<Nothing>()

    fun toData() = if (this is OnSuccess) data else null
}