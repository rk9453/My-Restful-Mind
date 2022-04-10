package com.example.myrestfulmind.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

@Dao
interface UserDAO {
    @Insert
    fun insert(vararg user: User)

    @Query("Select * from User where email = :mail and password = :pwd")
    fun findByEmail(mail : String, pwd : String): User

    @Delete
    fun deleteUser(user: User)
}