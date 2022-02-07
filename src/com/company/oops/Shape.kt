package com.company.oops

sealed class Shape {


    class Circle(var radius: Int) : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var len: Int, var breadth: Int) : Shape()
}
fun eval(e:Shape)=
    when(e){
        is Shape.Circle -> println("area of circle ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("area of square ${e.side*e.side}")
        is Shape.Rectangle -> println("area of rectangle ${e.len*e.breadth}")

    }
fun main(){
    val circle=Shape.Circle(5)
    val square=Shape.Square(4)
    val rectangle=Shape.Rectangle(2,3)

    eval(circle)
    eval(square)
    eval(rectangle)
}
