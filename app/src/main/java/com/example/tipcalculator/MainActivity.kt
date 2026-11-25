package com.example.tipcalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun TipCalculatorScreen() {
    var orderSum by remember { mutableStateOf("") }
    var dishCount by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = orderSum,
            onValueChange = { orderSum = it },
            label = { Text("Сумма заказа") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = dishCount,
            onValueChange = { dishCount = it },
            label = { Text("Количество блюд") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, name = "Шаг 2: Поля ввода")
@Composable
fun PreviewStep2() {
    TipCalculatorScreen()
}