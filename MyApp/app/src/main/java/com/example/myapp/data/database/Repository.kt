package com.example.myapp.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Repository(
    private val dormDao: DormDao
) {
    private fun initDatabase(postInitAction: () -> Unit) {
        GlobalScope.launch {
            // Prepopulate notes
            val phones = DormDatabaseModel.DEFAULT_DORM.toTypedArray()
            val dbPhones = dormDao.getAllSync()
            if (dbPhones.isNullOrEmpty()) {
                dormDao.insertAll(*phones)
            }
            postInitAction.invoke()
        }
    }
    private val dormFavoriteLiveData: MutableLiveData<List<DormDatabaseModel>> by lazy {
        MutableLiveData<List<DormDatabaseModel>>()
    }

    fun getAllPhonesNotInTrash(): LiveData<List<DormDatabaseModel>> = dormFavoriteLiveData
}