package com.example.herritagecorneruas.ui.musik

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MusikClass(
    val musikimg: Int,
    val namamusik: String,
    val deskmusik: String,
) : Parcelable