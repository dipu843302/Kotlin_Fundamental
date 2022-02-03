package com.company.`Exception Handling`

fun main(){
    try {
        val a=20/0
        println(a)
    }catch (e:ArithmeticException){
        println(e)
    }


}