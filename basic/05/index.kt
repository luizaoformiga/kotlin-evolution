// operadores comparativos

maior / menor // funçao

a > b ou a < b // expressao

a.compareTo(b) > 0 or a.compareTo(b) < 0 // comando


// ex 1
maior / menor igual // funçao

a >= b ou a <= b // expressao

a.compareTo(b) >= 0 or a.compareTo(b) <= 0 // comando


// ex 2
igual // funçao

a == b // expressao

a.equals(b) < 0 // comando


// ex 3
diferente // funçao

a != b // expressao

!(a.equals(b)) < 0 // comando


const val EQUAL = 0
const val LESS = -1
const val MORE = 100

fun main() {
    val dolar = 220
    val trigger = 90

    println(dollar >= trigger) // true
    println(dollar.compareTo(trigger) == EQUAL) // false
}