package com.arch.marvel.utilites

import java.math.BigInteger
import java.security.MessageDigest

fun String.md5(): String {
    val messageDigest = MessageDigest.getInstance("md5")
    return BigInteger(1, messageDigest.digest(toByteArray())).toString(16).padStart(32, '0')
}