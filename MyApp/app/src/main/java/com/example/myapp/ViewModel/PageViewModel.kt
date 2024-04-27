package com.example.myapp.ViewModel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel(application: Application): ViewModel() {
    private val _filter: MutableLiveData<String> = MutableLiveData("Area")
    val filter: LiveData<String> = _filter
    fun onFilterChange(newFilter: String) {
        _filter.value = newFilter
    }
}