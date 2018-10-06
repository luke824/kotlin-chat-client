package com.example.luke.kotlinchatclient

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: Word)

    @Query("SELECT * from word ORDER BY word ASC")
    fun allWords(): List<Word>

    @Query("DELETE FROM word")
    fun deleteAll()
}