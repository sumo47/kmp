//package org.example.project.repository
//
//import org.example.project.database.PlayerDatabase
//import org.example.project.database.PlayerTable
//
//
//class repository(private val db: PlayerDatabase) {
//
//
//    suspend fun updatePlayer(player: PlayerTable) {
//        db.dao.updatePlayer(player)
//    }
//
//
//    suspend fun getALLPlayer() = db.dao.getPlayerDetails()
//
//}