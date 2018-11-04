package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "fidelitycard")
@Parcelize
data class Fidelitycard (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")val id: Int,
        @ColumnInfo(name = "shopId")val shopId: Int,
        @ColumnInfo(name = "validityDate")var validityDate: Date,
        @ColumnInfo(name = "linkToAccount")var linkToAccount: String,
        @ColumnInfo(name = "userId")var userId: Int
) : Parcelable