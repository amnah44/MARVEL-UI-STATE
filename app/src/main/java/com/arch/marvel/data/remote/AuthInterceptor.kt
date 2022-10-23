package com.arch.marvel.data.remote

import com.arch.marvel.utilites.md5
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    private val ts = System.currentTimeMillis().toString()
    private val apiKey = "7cf285fa6a213434462bebda35278817"
    private val privateKey = "c8fdd2822f64b7319982db07357b19e394e982ee"
    private val hash = "$ts$privateKey$apiKey".md5()

    override fun intercept(chain: Interceptor.Chain): Response {
        val marvelUrl = chain.request()
            .url
            .newBuilder()
            .addQueryParameter(TS, ts)
            .addQueryParameter(API_KEY, apiKey)
            .addQueryParameter(HASH, hash)
            .build()

        return chain.proceed(chain.request().newBuilder().url(marvelUrl).build())
    }

    companion object {
        const val TS = "ts"
        const val API_KEY = "apikey"
        const val HASH = "hash"

    }
}