package com.example.dorispc.firstkotlintestapplication.bo

import android.arch.persistence.room.*

@Entity(tableName = "user")
data class User (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")val id: Int,
        @ColumnInfo(name = "name")var name:String,
        @ColumnInfo(name = "firstname")var firstname: String,
        @ColumnInfo(name = "username")var username: String,
        @ColumnInfo(name = "email")var email: String,
        @ColumnInfo(name = "password")var password: String
)