package com.memtarhan.com.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar() {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically){
        IconButton(onClick = {}) {
            Image(painterResource(R.drawable.hamburger_menu), contentDescription = "Menu Icon")
        }
        Image(painterResource(R.drawable.littlelemonlogo),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier.fillMaxWidth(0.5F).padding(horizontal = 20.dp))
        IconButton(onClick = {}) {
            Image(painterResource(R.drawable.cart), contentDescription = "Cart Icon")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}