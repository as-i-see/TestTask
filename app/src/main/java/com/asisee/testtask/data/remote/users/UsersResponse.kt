package com.asisee.testtask.data.remote.users

import com.asisee.testtask.data.User

data class UsersResponse (
    val total_pages: Int,
    val page: Int,
    val users: List<User>
)