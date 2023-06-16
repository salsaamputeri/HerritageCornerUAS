package com.example.herritagecorneruas.ui.batik

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BatikClass(
    val batikimg: Int,
    val namabatik: String,
    val deskbatik: String,
    val tambahan: String
) : Parcelable