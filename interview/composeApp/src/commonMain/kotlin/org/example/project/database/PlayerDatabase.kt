package org.example.project.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [PlayerTable::class],
    version = 1
)


abstract class PlayerDatabase : RoomDatabase() {
    abstract fun PlayerDao(): PlayerDao
}