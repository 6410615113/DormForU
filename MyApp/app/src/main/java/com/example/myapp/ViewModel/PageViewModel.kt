package com.example.myapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel: ViewModel() {
    private val _filter: MutableLiveData<String> = MutableLiveData("")
    val filter: LiveData<String> = _filter
    fun onFilterChange(newFilter: String) {
        _filter.value = newFilter
    }
}