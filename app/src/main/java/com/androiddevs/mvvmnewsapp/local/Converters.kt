package com.androiddevs.mvvmnewsapp.local

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name.toString()
    }
    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}