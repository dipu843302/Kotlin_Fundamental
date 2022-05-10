package com.company.Collections

fun main(){
    var hashMap=HashMap<Int,String>()
    hashMap[1] = "one"
    hashMap.put(2,"two")
    hashMap.put(3,"three")

    hashMap.put(3,"three and four")

    for (i in hashMap.keys){
        println("Element at key $i= ${hashMap[i]}")
    }
}