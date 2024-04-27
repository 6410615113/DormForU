package com.example.myapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DormDatabaseModel::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun dormDao(): DormDao
    companion object {
        private const val DATABASE_NAME = "dorm-database"
        private var INSTANCE:AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            var instance = INSTANCE
            if(instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return instance
        }
    }

}