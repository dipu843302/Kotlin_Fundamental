package com.company.kotlin_operator

fun main(){
    var a=10
    var b=5
    var c=15

    var result:Boolean = (a>b) && (a>c)
    println("(a>b) && (a>c) $result")

    result = (a>b) || (a>c)
    println("(a>b) || (a>c) :$result")

}