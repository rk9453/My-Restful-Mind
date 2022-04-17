package com.example.myrestfulmind.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

@Dao
interface DAO {
    @Insert
    fun insert(vararg user: Date)

    @Query("Select * from Date")
    fun find(): Date

    @Delete
    fun delete(user: Date)
}