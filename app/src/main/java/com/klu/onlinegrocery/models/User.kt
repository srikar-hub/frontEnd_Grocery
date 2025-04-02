package com.klu.onlinegrocery.models

data class User(
    val name: String,
    val email: String,
    val password: String,
    val profileImage : String? = null
)
