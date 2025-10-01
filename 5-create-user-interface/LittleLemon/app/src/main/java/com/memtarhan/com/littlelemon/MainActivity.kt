package com.memtarhan.com.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
            MainComponent()
        }
    }
}


@Composable
fun MainComponent() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF495E57))
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
        )

        Text(
            text = stringResource(id = chicago),
            fontSize = 24.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp),
            )

        Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {/* TODO */ },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(text = stringResource(order))
            }

            Image(
                painter = painterResource(R.drawable.restaurantfoodb),
                contentDescription = "",
                Modifier.height(100.dp)
            )
        }
    }
}