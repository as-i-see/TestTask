package com.asisee.testtask.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.asisee.testtask.data.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<User>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: User)

    @Query("SELECT * FROM user WHERE id=:id")
    suspend fun getById(id: Int): User?

    @Query("SELECT * FROM user ORDER BY registration_timestamp DESC")
    fun pagingSource(): PagingSource<Int, User>

    @Query("DELETE FROM user")
    suspend fun clearAll()
}