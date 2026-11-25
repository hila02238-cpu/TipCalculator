package com.example.tipcalculator

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