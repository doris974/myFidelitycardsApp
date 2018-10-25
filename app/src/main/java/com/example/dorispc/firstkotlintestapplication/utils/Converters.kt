package com.example.dorispc.firstkotlintestapplication.utils

import android.arch.persistence.room.TypeConverter
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycards
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
    fun stringToFidelitycards(value: String): Fidelitycards {
        val cards = Arrays.asList(value.split("\\s*,\\s*".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
        return Fidelitycards(cards)
    }

    @TypeConverter
    fun fidelitycardsToString(cl: Fidelitycards): String {
        var value = ""

        for (lang in cl.fidelitycards)
            value += lang + ","

        return value
    }
}