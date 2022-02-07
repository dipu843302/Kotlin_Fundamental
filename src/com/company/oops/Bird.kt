package com.company.oops

// Method overriding
open class Bird {
    open var color="Black"
    open fun fly(){
        println("Bird is flying")
    }
}

class Parrot:Bird(){
    override var color="Green"
    override fun fly(){
        println("Parrot is flying")
    }
}
class Pigeon:Bird(){
    override var color="White"
    override fun fly(){
        println("Parrot is flying")
    }
}

fun main(){
    val p=Parrot()
    p.fly()
    println(p.color)
    val pigeon=Pigeon()
    pigeon.fly()
    println(pigeon.color)
}