package com.company.Function

fun main(){
    val add={a:Int,b:Int->a+b} //lambda function
    println(add(10,20))

    val multi={a:Int->a*a}
    println(multi(10))

}

