package com.company.Collections

fun main(){
    var arrayList=ArrayList<Int>()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)

    println(arrayList.size)
    arrayList.remove(4)
    for (i in arrayList){
        println(i)
    }
}