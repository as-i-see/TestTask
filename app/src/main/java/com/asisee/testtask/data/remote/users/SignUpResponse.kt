package com.asisee.testtask.data.remote.users

data class Fails(
    val name: List<String>?,
    val email: List<String>?,
    val phone: List<String>?,
    val position_id: List<String>?,
    val photo: List<String>?,
)

data class SignUpResponse(
    val message: String,
    val fails : Fails?
)
