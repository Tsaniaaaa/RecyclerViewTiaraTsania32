package com.example.recyclerview_tiaratsania_32

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sebong(
    val imgSebong: Int,
    val nameSebong : String,
    val descSebong : String
) : Parcelable
