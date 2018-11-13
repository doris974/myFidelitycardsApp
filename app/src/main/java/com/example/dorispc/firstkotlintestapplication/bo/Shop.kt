package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Shop (
        @PrimaryKey(autoGenerate = true)
        val idShop: Int,
        val name: String,
        var logo: String
) : Parcelable