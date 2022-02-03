package com.company.`Exception Handling`

fun main(){
    try {
        val a=10/5
        println(a)
    }catch (e:ArithmeticException){
       println(e)
    }finally {
        println("finally block always executes")
    }
}