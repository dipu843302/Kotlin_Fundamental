package com.company.`Kotlin Generics`

class Person<T>(age:T) {
    var age:T=age
    init {
        this.age=age
        println(age)
    }
}
fun main(){
    var ageInt:Person<Int> =Person(30)
    var ageString:Person<String> =Person("40")
}