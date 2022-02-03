package com.company.Function

fun main(){
    show()
    run_fun(5,'a')
}

fun run_fun(i: Int=10, c: Char='d') {
  println("$i and $c")
}

fun show(a:Int=25,b:String="Your age") {
    println("$b is $a")
}
