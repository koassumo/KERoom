package com.example.keroom.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.keroom.entity.Employee

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employee")
    fun getAll(): List<Employee>

    //@Insert
    //fun insert(lisEmployee: List<Employee>)

    @Insert
    fun insert(employee: Employee)

    //@Delete
    //fun delete(cheese: Cheese)

}