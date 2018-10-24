package com.example.dorispc.firstkotlintestapplication.dao

import android.arch.persistence.room.*
import com.example.dorispc.firstkotlintestapplication.bo.Shop

@Dao
interface ShopDao {
    @Query("SELECT * FROM shop WHERE id = :id")
    fun getOne(id: Int): Shop

    @Query("SELECT * FROM shop")
    fun getAll(): List<Shop>

    @Insert
    fun insert(shop: Shop)

    @Update
    fun update(shop: Shop)

    @Delete
    fun delete(shop: Shop)

}