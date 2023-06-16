package com.example.herritagecorneruas.ui.museum

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MuseumViewModel : ViewModel() {
    fun setText(s: String) {

    }

    private val _text = MutableLiveData<String>().apply {
        value = "Museum Ullen Sentalu hadir berlandaskan inklusivitas dan merupakan ruang bagi dialog budaya dari masa lalu, kini, hingga mendatang. Ullen Sentalu berperan dalam menjembatani tantangan proses budaya masa kini melalui memori kolektif yang menjadi identitas budaya bangsa." +
                ""

    }
    val text: LiveData<String> = _text
}