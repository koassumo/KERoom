package com.example.keroom.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.keroom.entity.Employee

@Database(entities = [Employee::class], version = 1)
abstract class EmployeeDb : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao

    companion object {
        private var instance: EmployeeDb? = null

        @Synchronized
        fun get(context: Context): EmployeeDb {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    EmployeeDb::class.java, "database"
                ).build()

//                instance = Room.databaseBuilder(context.applicationContext,
//                    EmployeeDb::class.java, "CheeseDatabase")
//                    .addCallback(object : RoomDatabase.Callback() {
//                        override fun onCreate(db: SupportSQLiteDatabase) {
//                            fillInDb(context.applicationContext)
//                        }
//                    }).build()

            }
            return instance!!
        }

//        fun fillInDb(context: Context) {
//                val employee: Employee = Employee(0, "Employee", 1000)
//                get(context).employeeDao().insert(employee)
//        }
//
//        fun fillInDb(context: Context) {
//            val employee: Employee = Employee(0, "Employee", 1000)
//            get(context).employeeDao().insert(employee)
//        }



//        private fun fillInDb(context: Context) {
//            ioThread {
//                get(context).cheeseDao().insert(
//                    CHEESE_DATA.map { Cheese(id = 0, name = it) })
//            }
//        }

    }
}