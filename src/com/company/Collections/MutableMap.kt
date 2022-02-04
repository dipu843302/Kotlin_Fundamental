package com.company.Collections

fun main(){
    val mutableMap:MutableMap<Any,Any> = mutableMapOf<Any,Any>()
    mutableMap.put(1,"One")
    mutableMap["Hey"] = "Hello"
    mutableMap[3]="three"
    for (i in mutableMap.keys){
        println("$i=${mutableMap[i]}")
    }
    println(mutableMap.containsValue("One"))
    println(mutableMap.containsKey(3))
    println(mutableMap.get("Hey"))
    println(mutableMap.count())
}