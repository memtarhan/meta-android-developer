package com.memtarhan.com.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}


@Composable
fun HomeScreen() {
    Scaffold(
        // top app bar
        topBar = {
            TopAppBar()
        }

    ) {

        Column {
            UpperPanel()
            LowerPanel()
        }

    }
}