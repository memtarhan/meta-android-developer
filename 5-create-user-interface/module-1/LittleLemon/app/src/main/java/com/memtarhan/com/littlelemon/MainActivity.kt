package com.memtarhan.com.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.memtarhan.com.littlelemon.R.string.chicago
import com.memtarhan.com.littlelemon.R.string.order

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text(
                    text = "Little Lemon",
                    fontSize = 32.sp,
                    color = Color(0xFFF4CE14)
                )

                Text(
                    text = stringResource(id = chicago),
                    fontSize = 32.sp,
                    color = Color(0xFFF4CE14)
                )

                Row {
                    Button({/* TODO */ }) {
                        Text(text = stringResource(order))
                    }

                    Image(painter = painterResource(R.drawable.restaurantfoodb), contentDescription = "")
                }
            }

        }
    }
}
