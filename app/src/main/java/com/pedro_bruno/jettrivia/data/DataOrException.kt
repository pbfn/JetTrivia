package com.pedro_bruno.jettrivia.data

data class DataOrException<T, Boolean, E : Exception>(
    var data: T? = null,
    var loadingState: Boolean? = null,
    var e: E? = null
)