package com.example.dorispc.firstkotlintestapplication.dao


import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycard
import com.example.dorispc.firstkotlintestapplication.bo.Shop
import com.example.dorispc.firstkotlintestapplication.bo.User
import com.example.dorispc.firstkotlintestapplication.utils.Converters

@Database(entities = [User::class,Shop::class,Fidelitycard::class], version = 4)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun fidelitycardDao():FidelitycardDao
    abstract fun userDao(): UserDao
    abstract fun shopDao(): ShopDao

    companion object {
        var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) synchronized(AppDatabase::class) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "MyFidelitycards")
                        .build()
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}