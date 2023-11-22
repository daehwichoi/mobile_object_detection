package com.example.object_detection

fun printHello(phrase: String): String {
    return phrase
}


fun main() {
    var a: Int = 10
    var b: Int = 20

    val array_a: Array<Int> = Array(10, { 0 })

    for (i in 1..10) {
        array_a[i - 1] = i
        println(array_a[i - 1])
    }



    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("b가 a보다 크다")
    }

    for (i in a..b) {
        var c: String = printHello("devhwi")

        println(c)
    }


}