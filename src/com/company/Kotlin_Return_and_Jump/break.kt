package com.company.Kotlin_Return_and_Jump

fun main() {
    var arraylist=ArrayList<String>()
    arraylist.add("ram")
    arraylist.add("shyam")
    arraylist.add("mohan")

    var string=""
    for (i in arraylist){
        string=string+i
        println(string)
    }
}