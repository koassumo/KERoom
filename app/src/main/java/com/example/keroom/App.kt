package com.example.keroom

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.keroom.database.EmployeeDb


class App : Application() {
    var instance: App? = null

//    var mDatabase: Database? = null
//
//    override fun onCreate() {
//        super.onCreate()
//        instance = this
//        mDatabase = Room.databaseBuilder(
//            applicationContext,
//            EmployeeDb::class.java,
//            "database"
//        ).build()
//    }
//
//    @JvmName("getInstance1")
//    fun getInstance(): App? {
//        return instance
//    }
//
//    fun getDatabase(): Database? {
//        return mD
//    }
}