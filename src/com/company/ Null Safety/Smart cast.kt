package com.company.` Null Safety`

fun main(){
    var name:String?="Dipu Kumar"
    if (name != null) {
        println(name.length)
    }
    val obj:Any="Hey ! How are you ?"
    if (obj is String){
        println(obj.length)
    }
}