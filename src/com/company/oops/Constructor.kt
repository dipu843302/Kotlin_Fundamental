package com.company.oops

class Constructor(name:String,id:Int) {
    init {
        println("Name =$name id=$id")
    }
}
class MyConstructor(education:String){
    constructor(address:String,age:Int,education: String) : this(education ="" ) {
        println("Address =$address")
        println("Age =$age")
        println("Education =$education")
    }

}
fun main(){
    val constructor=Constructor("Dipu",1)
    val myConstructor=MyConstructor("Patna",22,"BCA")
}