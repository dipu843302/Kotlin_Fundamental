package com.company.`Exception Handling`

fun main() {
    drive(15)
    println("code after validation check")
}

fun drive(i: Int) {
    if (i < 18) {
        throw ArithmeticException("under age")
    } else {
        println("eligible for drive")
    }

}
