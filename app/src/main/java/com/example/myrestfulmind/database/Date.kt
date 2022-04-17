package com.example.myrestfulmind.database
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Date(val day: Int, val month: Int, val year: Int) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}