package com.company.Control_Flow

import java.util.*

fun main(){
    val read=Scanner(System.`in`)
    val a= read.nextInt()
    if (a>= 18){
        println("Eligible for vote ")
    }else{
        println("You are child")
    }

    val b=10
    val c=20

    val result=if (b>c){
        "$b is greater than $c"
    }else{
        "$b is smaller than $c"

    }
    println(result)
}