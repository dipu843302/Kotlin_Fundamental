package com.company.Control_Flow

fun main(){

    //Iterate through array
    var array= arrayOf(10,20,30,40)

    for (i in array){
        println(i)
    }


    for (i in array.indices){
     //   println(array[i])
    }

    // Iterate through range

    for (i in 1..5){
      //  println(i)
    }
    for (i in 5 downTo 1){
      //  println(i)
    }
    for (i in 1..5 step 2){
          println(i)
    }
}