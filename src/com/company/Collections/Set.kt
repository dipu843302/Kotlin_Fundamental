package com.company.Collections

fun main(){
    var set= setOf<Int>(1,2,3,3,4,5,4)
    for (i in set){
        println(i)
    }
    var set2= setOf<Any>(2,"hey",3,"Hello","hey")
    for (i in set2){
        println(i)
    }


}