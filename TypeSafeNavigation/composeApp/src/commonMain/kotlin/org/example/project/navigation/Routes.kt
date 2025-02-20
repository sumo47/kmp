package org.example.project.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    object LoginPage : Routes()

    @Serializable
    object HomePage : Routes()

}