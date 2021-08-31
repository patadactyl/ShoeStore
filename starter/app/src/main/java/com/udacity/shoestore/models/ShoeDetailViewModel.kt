package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeDetailViewModel: ViewModel() {
    private val _shoeDetail = MutableLiveData<String>()
    val shoeDetail : LiveData<String>
        get() = _shoeDetail

    init {
    }
}