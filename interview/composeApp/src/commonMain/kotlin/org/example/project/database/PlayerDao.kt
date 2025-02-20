package org.example.project.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao
interface PlayerDao {

    @Upsert
    suspend fun updatePlayer(player: PlayerTable)

    @Delete
    suspend fun deletePlayer(player: PlayerTable)

    @Query("SELECT * FROM PlayerTable")
    fun getPlayerDetails(): Flow<List<PlayerTable>>

}