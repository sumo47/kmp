package org.example.project.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class PlayerTable(
    var PlayerName: String,
    var GunShot: Int,
    var DeadShot: Int,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 1
)


