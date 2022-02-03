package com.company.Function

fun main() {
    val number = 5
    val result: Long = factorial(number)
    println(result)

}

fun factorial(number: Int): Long {
    return if (number == 1) {
         number.toLong()

    } else {
        number * factorial(number - 1)

    }
}
