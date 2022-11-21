package com.iago.pokewatch.utils

import com.iago.pokewatch.R

interface ErrorService {

    fun getErrorMessage(statusCode: Int, messageFail: Int): Int {

        return when (statusCode) {
            404 -> messageFail
            500 -> R.string.error_default
            else -> R.string.error_default
        }
    }
}