package com.company.`Kotlin Reflection`

class `Function Refernce` {
}
fun main(){
   fun isPositive(x:Int)=x>0
    val numbers= listOf<Int>(-10,-5,0,5,10)
    println(numbers.filter (::isPositive) )
}
