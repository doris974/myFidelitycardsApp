package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.*
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(foreignKeys = arrayOf(ForeignKey(entity = User::class,
        parentColumns = arrayOf("idUser"),
        childColumns = arrayOf("userId"),
        onDelete = ForeignKey.CASCADE)))
@Parcelize
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
data class Fidelitycard (
        @PrimaryKey(autoGenerate = true)
        val idFidelitycard: Int?,
        var validityDate: Date,
        var linkToAccount: String,
        var userId: Int,
        @Embedded
        var shop: Shop
) : Parcelable


