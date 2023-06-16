package com.example.herritagecorneruas.ui.batik

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BatikViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is batik Fragment"
    }
    val text: LiveData<String> = _text
}