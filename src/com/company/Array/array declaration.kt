package com.company.Array

fun main(){
    // array declaration - using arrayOf() function

    var array1= arrayOf(1,2,3,4)
    var array2= arrayOf<Int>(1,3,4,5)
    var array3= arrayOf<String>("one","two","three")
    var array4= arrayOf(1,20,33,"sunday",'d')

    // direct modify  the particular element
    array1.set(0,10)
    array1[3]=40

    for (i in array1){
        println(i)
    }
    println("iterating the loop")
    for (i in array1){
        println(i)
    }

    //direct access the particular element
    println(array1.get(2))
    println(array1[3])
}