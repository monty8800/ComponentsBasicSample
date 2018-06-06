package com.montywu.demo.livedata.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()

    val data:MutableLiveData<String>
        get() = _data

    init {
        _data.value = "Hello Monty!"
    }
}
