package com.example.tipcalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun calculateDiscount(dishCount: Int): Int {
    return when {
        dishCount in 1..2 -> 3
        dishCount in 3..5 -> 5
        dishCount in 6..10 -> 7
        dishCount >= 11 -> 10
        else -> 0
    }
}

fun calculateDiscountAmount(sum: Double, discountPercent: Int): Double {
    return sum * (discountPercent / 100.0)
}


@Composable
fun TipCalculatorScreen() {
    var orderSum by remember { mutableStateOf("") }
    var dishCount by remember { mutableStateOf("") }
    var tipPercent by remember { mutableStateOf(0f) }

    val currentDishCount = dishCount.toIntOrNull() ?: 0
    val currentDiscount = calculateDiscount(currentDishCount)

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Калькулятор чаевых", fontSize = 24.sp)

        OutlinedTextField(
            value = orderSum,
            onValueChange = { orderSum = it },
            label = { Text("Сумма заказа") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 8.dp)
        )

        OutlinedTextField(
            value = dishCount,
            onValueChange = { dishCount = it },
            label = { Text("Количество блюд") },
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "Чаевые: ${tipPercent.toInt()}%", modifier = Modifier.padding(top = 16.dp))
        Slider(
            value = tipPercent,
            onValueChange = { tipPercent = it },
            valueRange = 0f..25f,
            steps = 4,
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "Скидка:", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            listOf(3, 5, 7, 10).forEach { discount ->
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(end = 4.dp)) {
                    RadioButton(
                        selected = (currentDiscount == discount),
                        onClick = { }
                    )
                    Text("$discount%", fontSize = 14.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Шаг 4: Радиокнопки")
@Composable
fun PreviewStep4() {
    TipCalculatorScreen()
}