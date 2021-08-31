package com.udacity.shoestore.models

import android.text.format.DateUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class ShoeViewModel: ViewModel() {

    private val _shoe = MutableLiveData<String>()
    val shoe : LiveData<String>
        get() = _shoe

    private lateinit var shoeList: MutableList<String>

    init {
        resetList()
    }

    fun resetList() {
        shoeList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        shoeList.shuffle()
    }

}

