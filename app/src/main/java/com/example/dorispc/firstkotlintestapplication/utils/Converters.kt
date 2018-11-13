package com.example.dorispc.firstkotlintestapplication.utils

import android.arch.persistence.room.TypeConverter
import java.util.*


class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    /*
    @TypeConverter
    fun stringToFidelitycardList(value: String?): FidelitycardList? {
        val fidelitycards = Arrays.asList(value?.split("\\s*,\\s*".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray())
        return FidelitycardList(fidelitycards as MutableList<Fidelitycard>)
    }

    @TypeConverter
    fun fidelitycardListToString(list: FidelitycardList?): String? {
        var value = ""

        if(list != null){
            for (card in list.fidelitycardList)
                value += card.idFidelitycard.toString() + ","
            return value
        }
        return null
    }


    @TypeConverter
    fun stringToShop(value: String?): Shop? {
        val shops = Arrays.asList(value?.split("\\s*,\\s*".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray())
        return Shop(shops as MutableList<Array<String>>)
    }

    @TypeConverter
    fun shopToString(cl: FidelitycardS?): String? {
        var value = ""

        if(cl != null){
            for (lang in cl.fidelitycards)
                value += lang + ","
            return value
        }
        return null
    }*/
}