package com.example.myrestfulmind.database
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Therapist(val email: String, val password: String, val phone: String, val fname: String, val lname:String) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
