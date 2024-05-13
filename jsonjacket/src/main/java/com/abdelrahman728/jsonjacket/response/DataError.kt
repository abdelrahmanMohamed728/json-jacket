package com.abdelrahman728.jsonjacket.response


sealed interface DataError: RootError {
    enum class Network: DataError {
        REQUEST_TIMEOUT,WRONG_EMAIL_OR_PASSWORD
    }
    enum class Local: DataError {
        DISK_FULL
    }
}