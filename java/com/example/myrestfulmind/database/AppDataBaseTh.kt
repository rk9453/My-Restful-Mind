package com.example.myrestfulmind.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Therapist::class], version = 1)
abstract class AppDataBaseTh: RoomDatabase() {
    abstract fun therapistDAO(): TherapistDAO
}