package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.*
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "user")
@Parcelize
data class User (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")val id: Int?,
        @ColumnInfo(name = "name")var name:String?,
        @ColumnInfo(name = "firstname")var firstname: String?,
        @ColumnInfo(name = "email")var email: String?,
        @ColumnInfo(name = "password")var password: String?,
        var listOfFidelitycardS: FidelitycardS?
) : Parcelable