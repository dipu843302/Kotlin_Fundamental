package com.company.` Null Safety`


fun main(){

    val name:String?="Dipu Kumar"
    val len:Int=name?.length?:-1
   println(len)

    val lastName:String?=null
    val lenght:Int=lastName?.length?:-1
    println(lenght)

    val name3="Dipu kumar"
    val ans=name3?.length?:-1
    println(ans)
}