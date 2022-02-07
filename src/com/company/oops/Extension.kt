package com.company.oops

class Extension {
    fun isPassed( marks:Int):Boolean{
        return marks>45
    }
}
fun Extension.isExcellent(mark:Int):Boolean{
    return mark>90
}
fun main(){
    var extension=Extension()
   val passed= extension.isPassed(40)
   val excellent= extension.isExcellent(95)
    println(passed)
    println(excellent)
}