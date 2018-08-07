package ch2

import ch2.Color.RED
import ch2.Color.*

fun main(args: Array<String>) {
    println(RED.rgb())
    println(getFrench(Color.BLUE))

    println(mix(BLUE, YELLOW))
}

//enum class SimpleEnum {
//    RED, GREEN, BLUE
//}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb(): Int {
        return (r * 256 + g) * 256 + b
    }
}

fun getFrench(color: Color): String {
    return when (color) {
        Color.RED -> "Rouge"
        Color.ORANGE -> "Orange"
        Color.YELLOW -> "Jaune"
        Color.GREEN -> "Verte"
        Color.BLUE -> "Bleu"
        Color.INDIGO -> "Indigo"
        Color.VIOLET -> "Violet"
    }
}

fun isInFrenchFlag(color: Color) = when(color) {
    RED, BLUE -> true
    else -> false
}

fun mix(c1: Color, c2: Color): Color {
    return when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Bad Combination")
    }
}

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) ||
                    (c1 == YELLOW && c2 == RED)
            -> GREEN
            //shortened for brevity
            else -> throw Exception("Bad Combination")
        }



