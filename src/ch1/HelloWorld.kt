package ch1

import ch2.geometry.createRandomRectangle

/**
 * Hello World.
 *
 * Kotlin in Action ch 1
 *
 * Andrew Garner
 * August 6, 2018
 */
fun main(args: Array<String>) {
    val name = if (!args.isEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println(max(1, 2))

    val question = "The Ultimate Question of Life, the Universe, and everything"
    val answer = 42
    val answer2: Int = 42

    val yearsToCompute = 7.5e6


    val message = if (canPerformOperation()) {
        "Success"
    } else {
        "Failed"
    }

    println(message)

    val someone = Person("Andrew", false)
    someone.isReal = true
    println(someone.name)

    val shape = createRandomRectangle()
    println(shape.isSquare)

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Same as above but with an expression body
fun max2(a: Int, b: Int): Int = if (a > b) a else b

//Same as above but with return type omitted
fun max3(a: Int, b: Int) = if (a > b) a else b

fun canPerformOperation() = true

class Person(val name: String, var isReal: Boolean)

