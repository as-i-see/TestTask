package com.asisee.testtask.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.asisee.testtask.data.Page
import com.asisee.testtask.data.User

@Database(
    entities = [User::class, Page::class],
    version = 1,
)
abstract class LocalDatabase : RoomDatabase() {
    abstract val userDao: UserDao
    abstract val pageDao: PageDao
}