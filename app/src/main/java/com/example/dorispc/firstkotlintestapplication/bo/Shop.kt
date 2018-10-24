package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "shop")
data class Shop (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")val id: Int,
        @ColumnInfo(name = "name")val name: String,
        @ColumnInfo(name = "logo")var logo: String
)