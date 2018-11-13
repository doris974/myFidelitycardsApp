package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.*
import android.os.Parcelable
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class User (
        @PrimaryKey(autoGenerate = true)
        val idUser : Int?,
        var name : String,
        var firstname : String,
        var email : String,
        var password : String
) : Parcelable