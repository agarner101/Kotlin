/**
 * Basic Syntax Guide
 * https://kotlinlang.org/docs/reference/basic-syntax.html
 *
 * Andrew Garner 7/7/18
 */
//Suppressing warnings since this file is just random practice
@file:Suppress("unused", "UNUSED_VARIABLE")

package chX

fun main(args: Array<String>) {
    println(whenExpr(1L))
    ranges()
    collections()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun stringTemplates() {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}

fun parseInt(str: String): Int? {
    return if (str.startsWith("Hello")) {
        str.length
    } else {
        null
    }
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("Either '$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null;
}

fun forLoop() {
    val items = listOf("Apple", "Banana", "Kiwi")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileLoop() {
    val items = listOf("Apple", "Banana", "Kiwi")
    var index = 0

    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun whenExpr(obj: Any): String {
    return when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }
}

fun ranges() {
    val x = 10
    val y = 9

    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }


    //Ranges are inclusive
    for (i in 1..5) {
        print(i)
    }
    println()
    //Ranges can have progression
    for (i in 1..10 step 2) {
        print(i)
    }
    println()
    for (i in 9 downTo 0 step 3) {
        print(i)
    }
    println()

}

fun collections() {
    val items = listOf("Apple", "Banana", "Kiwi", "Avocado")

    for (item in items) {
        println(item)
    }

    when {
        "Orange" in items -> println("Orange exists")
        "Apple" in items -> println("An apple a day keeps the doctor away")
    }

    //lambda expression to filter and map collection
    items
            .filter { it.startsWith("A") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}