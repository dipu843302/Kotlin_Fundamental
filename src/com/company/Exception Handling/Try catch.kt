package com.company.`Exception Handling`

fun main() {
    val str = getNumber("10")
    println(str)
}

fun getNumber(s: String): Int {
    return try {
        Integer.parseInt(s)
    } catch (e: ArithmeticException) {
        0
    }
}
