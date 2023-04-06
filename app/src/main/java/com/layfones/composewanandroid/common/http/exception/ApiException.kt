package com.layfones.composewanandroid.common.http.exception

class ApiException(val code: Int, override val message: String?) : RuntimeException(message) {

    companion object {
        const val CODE_NOT_LOGGED_IN = -1001
    }

    fun isNotLogged() = code == CODE_NOT_LOGGED_IN

}