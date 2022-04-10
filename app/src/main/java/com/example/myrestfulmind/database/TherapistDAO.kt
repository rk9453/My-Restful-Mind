package com.example.myrestfulmind.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

@Dao
interface TherapistDAO {
    @Insert
    fun insert(vararg user: Therapist)

    @Query("Select * from Therapist where email = :mail and password = :pwd")
    fun findByMail(mail : String, pwd : String): Therapist

    @Delete
    fun delete(user: Therapist)
}