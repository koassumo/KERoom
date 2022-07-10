package com.example.keroom.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
public class Employee (

    @PrimaryKey
    val id: Long,

    val name: String,

    val salary: Int,
)