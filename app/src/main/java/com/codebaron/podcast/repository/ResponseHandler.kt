package com.codebaron.podcast.repository

open class ResponseHandler<out R> {
    object Loading : ResponseHandler<Nothing>()
    data class Success<out T>(val data: T) : ResponseHandler<T>()
    data class Exception(val exception: kotlin.Exception) : ResponseHandler<Nothing>()
    data class ErrorMessage(val message: String?) : ResponseHandler<Nothing>()
    data class Throwable(val throwable: kotlin.Throwable) : ResponseHandler<Nothing>()
}