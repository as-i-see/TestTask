package com.asisee.testtask.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Page(
    @PrimaryKey val id: Int,
    val page: Int,
    val total_pages: Int,
    val lastRefreshTimestamp: Long,
)

const val PAGE_SIZE = 6