package com.example.dorispc.firstkotlintestapplication.utils

import android.arch.persistence.room.TypeConverter
import com.example.dorispc.firstkotlintestapplication.bo.FidelitycardS
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

    @TypeConverter
    fun stringToFidelitycards(value: String?): FidelitycardS? {
        val cards = Arrays.asList(value?.split("\\s*,\\s*".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray())
        return FidelitycardS(cards as MutableList<Array<String>>)
    }

    @TypeConverter
    fun fidelitycardsToString(cl: FidelitycardS?): String? {
        var value = ""

        if(cl != null){
            for (lang in cl.fidelitycards)
                value += lang + ","
            return value
        }
        return null
    }
}