package com.asisee.testtask.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.asisee.testtask.data.Page

@Dao
interface PageDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Page)

    @Query("SELECT * FROM page WHERE id = :id")
    suspend fun getById(id: Int): Page?

    @Query("DELETE FROM page WHERE id = :id")
    suspend fun deleteById(id: Int)
}