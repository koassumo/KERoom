package com.example.keroom.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee (
    @PrimaryKey
    val id: Int,
    val name: String,
    val salary: Int,
)