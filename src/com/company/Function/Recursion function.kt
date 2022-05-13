package com.company.Function

fun main() {
    val number = 5
    val result: Long = factorial(number)
    println(result)

    val ans= factorialNumber(4)
    println(ans)
}

fun factorial(number: Int): Long {
    return if (number == 1) {
         number.toLong()

    } else {
        number * factorial(number - 1)

    }
}

//Working process of above factorial example
/*
factorial(5)
   factorial(4)
      factorial(3)
         factorial(2)
            factorial(1)
               return 1
            return 2*1 = 2
         return 3*2 = 6
      return 4*6 = 24
   return 5*24 = 120
 */

 tailrec fun factorialNumber(n: Int, run: Int = 1): Long {
    return if (n == 1){
        run.toLong()
    } else {
        factorialNumber(n-1, run*n)
    }
}
