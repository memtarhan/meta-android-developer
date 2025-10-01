package com.memtarhan.com.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memtarhan.com.littlelemon.R.string.chicago
import com.memtarhan.com.littlelemon.R.string.order

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
                    Button(
                        onClick = {/* TODO */ },
                        border = BorderStroke(1.dp, Color.Red),
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = stringResource(order))
                    }

//                    Image(painter = painterResource(R.drawable.restaurantfoodb), contentDescription = "")
                }
            }

        }
    }
}
