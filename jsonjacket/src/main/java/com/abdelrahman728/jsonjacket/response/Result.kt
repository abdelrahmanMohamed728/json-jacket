package com.abdelrahman728.jsonjacket.response

sealed interface Result<out D, out E : RootError> {
    data class Success<out D, out E : RootError>(val data: D) : Result<D, E>
    data class Error<out D, out E : RootError>(val error: E) : Result<D, E>
    class Loading<out D, out E : RootError> : Result<D, E>
    class Default<out D, out E : RootError> : Result<D, E>
}