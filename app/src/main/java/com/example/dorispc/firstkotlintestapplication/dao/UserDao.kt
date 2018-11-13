package com.example.dorispc.firstkotlintestapplication.dao


import android.arch.persistence.room.*
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycard
import com.example.dorispc.firstkotlintestapplication.bo.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user WHERE idUser = :id")
    fun getOne(id: Int): User

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Insert
    fun insert(user: Array<out User?>)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM Fidelitycard WHERE userId= :id")
    fun getUsersFidelitycardList(id: Int) : List<Fidelitycard>
}