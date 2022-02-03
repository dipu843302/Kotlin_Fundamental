package com.company.Function

import kotlin.math.sqrt

fun main(){
    //Standard library function
    val number=25
    val ans= sqrt(number.toDouble())
    println(ans)

    //User defined function
    mulitply(4,5)
}

 fun mulitply(i: Int, i1: Int) {
    println(i*i1)

 }
