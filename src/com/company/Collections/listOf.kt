package com.company.Collections

fun main(){
    var list=listOf(1,2,3,"Hey","Hello")

    for (i in list){
        println(i)
    }
    for (i in 0..list.size-1){
        println(list[i])
    }

    var list2:List<String> = listOf<String>("One","Two","Three")

    for (i in list2){
        println(i)
    }
}