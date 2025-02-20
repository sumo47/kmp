//package org.example.project.repository
//
//import androidx.lifecycle.ViewModel
//import androidx.room.util.ViewInfo
//import org.example.project.database.PlayerTable
//
//class viewModel (private val repository: repository):ViewModel() {
//    fun getAllPlayer() = repository.getALLPlayer().asLiveData(viewModelScope.coroutineContext)
//
//    suspend fun updatePlayer(player: PlayerTable) = viewModelScope.launch {
//        repository.updatePlayer(player)
//    }
//}