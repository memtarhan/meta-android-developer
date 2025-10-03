package com.memtarhan.com.littlelemon

interface Destinations {
    val route: String
}

object Home : Destinations {
    override val route = "Home"
}

object Menu : Destinations {
    override val route = "Menu"
}