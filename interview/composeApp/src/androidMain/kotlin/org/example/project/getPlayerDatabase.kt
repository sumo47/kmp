package org.example.project

import android.content.Context;

import androidx.room.Room;
import androidx.sqlite.driver.bundled.BundledSQLiteDriver;

import org.example.project.database.PlayerDatabase;

fun getPlayerDatabase(context: Context): PlayerDatabase {
    val dbFile = context.getDatabasePath("Player.db")
    return Room.databaseBuilder<PlayerDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}