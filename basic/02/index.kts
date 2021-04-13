// Declarar variaveis

var // valor mutavel, camelCase
val  // valor imutavel, camelcase
const val // valor imutavel, snake_case

// exemplos

// var
var currentAge = 22

var currentAge: Int?
currentAge = // null or 22


// val
val currentAge = 22

val currentAge: Int?
currentAge = // null or 22


// const val
        const val MIN_AGE = 17
const val MAX_AGE = 89


const val MAX_AGE = 90
fun main() {
    var currentAge:Int
    currentAge = 90

    println(currentAge)
    println(MAX_AGE)

}