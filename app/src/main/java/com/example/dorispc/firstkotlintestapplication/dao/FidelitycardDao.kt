package com.example.dorispc.firstkotlintestapplication.dao

import android.arch.persistence.room.*
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycard

@Dao
interface FidelitycardDao {
    @Query("SELECT * FROM fidelitycard WHERE id = :id")
    fun getOne(id: Int):Fidelitycard

    @Query("SELECT * FROM fidelitycard WHERE userId = :userId")
    fun getOneByUser(userId: Int):Fidelitycard

    @Query("SELECT * FROM fidelitycard")
    fun getAll(): List<Fidelitycard>

    @Query("SELECT *FROM fidelitycard WHERE userId = :userId")
    fun getAllByUser(userId:Int): List<Fidelitycard>

    @Insert
    fun insert(fidelitycard: Fidelitycard)

    @Update
    fun update(fidelitycard: Fidelitycard)

    @Delete
    fun delete(fidelitycard: Fidelitycard)
}