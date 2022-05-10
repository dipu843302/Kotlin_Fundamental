package com.company.Kotlin_Return_and_Jump

fun main() {
    for (i in 1..5){
        if (i==3)
            break
        println(i)
    }

    for (i in 1..4){
        if (i==2)
            continue
        println(i)
    }
}