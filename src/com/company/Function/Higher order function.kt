package com.company.Function

fun main() {
    val lambda = { println("Hello") } //lambda function

    higherorder(lambda)
}

fun higherorder(lambda: () -> Unit) {  // Higher order function
    lambda()
}
