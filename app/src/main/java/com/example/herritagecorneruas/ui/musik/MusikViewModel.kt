package com.example.herritagecorneruas.ui.musik

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusikViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is musik Fragment"
    }
    val text: LiveData<String> = _text
}