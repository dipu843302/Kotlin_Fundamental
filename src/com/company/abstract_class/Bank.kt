package com.company.abstract_class

abstract class Bank {
    abstract fun interest(p:Int,r:Int,t:Int): Int
    fun add(){
        println("Abstract class")
    }
}

class SBI:Bank(){
    override fun interest(p: Int, r: Int, t: Int): Int {
        return (p*r*t)/100
    }


}
class PNB:Bank(){
    override fun interest(p: Int, r: Int, t: Int): Int {
        return (p*r*t)/100
    }
}

fun main(){
    val sbi=SBI()
    val ans2=sbi.interest(1000,5,5)
     sbi.add()
    println("SBI interest $ans2")

    val pnb=PNB()
   val ans= pnb.interest(1000,4,5)
    println("PNB interest $ans")
}