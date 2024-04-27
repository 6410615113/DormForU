package com.example.myapp.data.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface  DormDao {
    @Query("SELECT * FROM DormDatabaseModel ORDER BY id ASC")
    fun getAllSync():List<DormDatabaseModel>
    @Query("SELECT * FROM DormDatabaseModel ORDER BY location ASC")
    fun getDormOrderByArea(): List<DormDatabaseModel>
    @Query("SELECT * FROM DormDatabaseModel ORDER BY price ASC")
    fun getDormOrderByPrice(): List<DormDatabaseModel>
}