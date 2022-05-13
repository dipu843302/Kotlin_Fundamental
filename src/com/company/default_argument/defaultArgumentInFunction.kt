package com.company.default_argument

fun main() {
    run()
    println("After passing argument")
    run(5)
    println("After passing second parameter")
    run(letter = 'z')
}

fun run(num: Int = 10, letter: Char = 'x') {
    println("Number is $num and letter is $letter")
}