package com.company.Collections


fun main(){
    val map= mapOf<Int,String>(1 to "Dipu",2 to "Golu",3 to "shivam")

    for (i in map.keys){
        println("Element at key $i =${map[i]}")
    }
    println(map.containsKey(4))
    println(map.containsValue("Golu"))


}