package com.company.oops

// Abstract
abstract class Car {
    abstract fun run()
    fun light(){
        println("Car has four light")
    }
}

class Honda():Car(){
    override fun run() {
        println("Honda is running safely")
    }

}
fun main(){
    var honda=Honda()
    honda.run()
    honda.light()
}