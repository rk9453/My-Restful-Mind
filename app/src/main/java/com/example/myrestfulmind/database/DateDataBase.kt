package com.example.myrestfulmind.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Date::class], version = 1)
abstract class DateDataBase: RoomDatabase() {
    abstract fun dateDAO(): DAO
}