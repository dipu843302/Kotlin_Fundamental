package com.company.Collections

fun main(){
    var mutableList= mutableListOf<Int>(1,2,3)
    mutableList.add(4)
    mutableList.add(5)
    for (i in mutableList){
        println(i)
    }
   println()
    println(mutableList.get(mutableList.size-1))
    println(mutableList.contains(3))

    mutableList.add(0,0)
    println(mutableList[0])
}