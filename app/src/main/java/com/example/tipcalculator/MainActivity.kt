package com.example.tipcalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


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
    Column {
        Text("Калькулятор чаевых")
    }
}


@Preview(showBackground = true, name = "Шаг 1")
@Composable
fun PreviewStep1() {
    TipCalculatorScreen()
}