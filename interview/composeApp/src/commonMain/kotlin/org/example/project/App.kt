package org.example.project

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.example.project.database.PlayerDao
import org.example.project.database.PlayerTable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App(dao: PlayerDao) {

    val getPlayer by dao.getPlayerDetails().collectAsState(initial = emptyList())

    val scope = rememberCoroutineScope()


    Column(modifier = Modifier.fillMaxWidth()) {
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(text = "sumit")

            Button(onClick = {
                scope.launch {
                    dao.updatePlayer(PlayerTable("sumit", 0, 1))
                }
            }) {
                Text(text = "increase Deadshot")
            }
            Button(onClick = {}) {
                Text(text = "Increase GunShot")
            }

        }
        Spacer(Modifier.size(10.dp))
        Row {
            Text(text = "DeadSot")
            Spacer(Modifier.size(8.dp))
            Text(text = "GunShot")
        }

        LazyColumn {
            items(getPlayer){player ->
                Text(text = player.DeadShot.toString(), Modifier.clickable {
                    scope.launch{
                        dao.deletePlayer(player)
                    }
                })

            }
        }

    }


}