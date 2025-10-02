package com.memtarhan.com.littlelemon

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memtarhan.com.littlelemon.R.string.location
import com.memtarhan.com.littlelemon.R.string.orderbuttontext

@Composable
fun UpperPanel() {
    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0XFF495E57))
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
        )

        Text(
            text = stringResource(id = location),
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 20.dp),
        )

        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.description),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp
            )
            Image(
                painter = painterResource(R.drawable.restaurantfoodb),
                contentDescription = "",
                Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }

        Button(
            onClick = {
                Toast.makeText(context, "Order Successful!", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0XFFF4CE14),
                contentColor = Color.Black
            )
        ) {
            Text(text = stringResource(orderbuttontext))
        }

    }
}