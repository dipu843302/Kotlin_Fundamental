package com.company.Control_Flow

fun main(){

    //Using when as an Expression
    var number=5
    var numberprovide=when(number){
        1 ->"1"
        2 ->"2"
        3 ->"3"
        4 ->"4"
        else ->"Invalid number"
    }
    println("You provide $numberprovide")

    //Using when Without Expression
    var num=2
    when(num){
        1 -> println("1")
        2 -> println("You provide $num")
        3 -> println("3")
        4 -> println("4")
        else -> println("Invalid number")
    }

    //Multiple branches of when

    val season=3
    when(season){
        1,2,3-> println("Cold season")
        4,5,6-> println("Winter season")
        7,8,9-> println("summer season")
        else -> println("Invalid number")
    }

    //Using when in the range
    var x=5
    when(x){
        in 1..3-> println("range 1 to 3")
        in 4..6-> println("range 4 to 6")
        else -> println("none of these")
    }
}