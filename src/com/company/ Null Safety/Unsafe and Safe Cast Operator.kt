package com.company.` Null Safety`

fun main(){

    // Unsafe
    val obj:String?="String unsafe cast"
    val string=obj as String
    println(string)

    // Safe
    val location:String="Patna"
    val locationString:String?=location as? String
     val locationInt:Int?=location as? Int

    println(locationString)
    println(locationInt)

}