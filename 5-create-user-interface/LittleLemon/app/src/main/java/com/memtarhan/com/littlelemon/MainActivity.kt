package com.memtarhan.com.littlelemon

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.memtarhan.com.littlelemon.ui.theme.Pink80
import com.memtarhan.com.littlelemon.ui.theme.Purple80
import com.memtarhan.com.littlelemon.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val materialBlue700 = Color(0xFF1976D2)
            val scaffoldState = rememberDrawerState(DrawerValue.Closed)
            Scaffold(
                topBar = {
                    TopAppBar()
                },
                content = { paddingValues ->
                    MenuContent(paddingValues = paddingValues)
                }
            )
        }
    }
}

@Composable
fun MenuContent(paddingValues: PaddingValues) {
    Surface(modifier = Modifier.padding(paddingValues)) {
        val menuPadding = 8.dp
        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            ORIENTATION_LANDSCAPE -> {
                Column {
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(
                            "Appetizers",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Purple80)
                                .padding(menuPadding)
                        )
                        Text(
                            "Salads",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .padding(menuPadding)
                        )
                    }
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(
                            "Drinks",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Pink80)
                                .padding(menuPadding)
                        )
                        Text(
                            "Mains",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(PurpleGrey80)
                                .padding(menuPadding)
                        )
                    }
                }
            }

            else -> {
                Column {
                    Text(
                        "Appetizers",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Purple80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Salads",
                        modifier = Modifier
                            .weight(0.25f)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Drinks",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Pink80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Mains",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(PurpleGrey80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}