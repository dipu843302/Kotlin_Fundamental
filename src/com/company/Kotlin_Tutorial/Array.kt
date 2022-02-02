package com.company.Kotlin_Tutorial

fun main(){

    // can store only integer type data
    val arr: Array<Int> = arrayOf(1,2,3,4)

    // any type of data can store
    val array = arrayOf(1,2,3,4,"hey",'d')
    val firstNo=array[0]
    val lastNo=array[array.size-1]

    println(firstNo)
    println(lastNo)
}
