package com.asisee.testtask.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user")
data class User(
    @PrimaryKey val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val position: String,
    val position_id: Long,
    val registration_timestamp: Long,
    val photo: String
)
