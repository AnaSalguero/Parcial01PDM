package com.pdm0126.orderup.Screens

import android.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdm0126.orderup.AppScaffold
import com.pdm0126.orderup.Components.productoItem
import com.pdm0126.orderup.Dummy.Menu
import com.pdm0126.orderup.ui.theme.OrderUpTheme

@Composable
fun MenuScreen(){
    AppScaffold(title="OrderUp!") { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
        ) {
            items(Menu){Producto ->
                productoItem(Producto)
                Spacer(modifier= Modifier.height(12.dp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuPreview() {
    OrderUpTheme {
        MenuScreen()
    }
}