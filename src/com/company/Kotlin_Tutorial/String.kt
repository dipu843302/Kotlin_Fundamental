package com.company.Kotlin_Tutorial

fun main(){

     //Escaped String
    val firstName="Dipu\n"
    val lastName="Kumar"

    print(firstName)
    print(lastName)

    //Raw String
    val address="""
        Punaura Dham 
           Sitamarhi
                Bihar
                """
    println(address)

    println(firstName[0])

    println("First Name $firstName Last Name $lastName")

    //Structural equality (==)

    val a="hello"
    val b="hello"

    println(a==b)
    println(a!=b)

    //Referential equality (===)

    val str1 = buildString { "string value" }
    val str2 = buildString { "string value" }
    println(str1===str2)
    println(str1!==str2)
}