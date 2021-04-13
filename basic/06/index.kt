// operadores logicos

&& // e

|| // ou

// operadores ``in`` e ``range``

//verficam se ha algum valor presente ou nao na lista

// ex: 

val numbers = listOf(3, 5, 6, 7)
print(12 in numbers) // false

print(12 in 0..20) // true


fun main() {
    var number = listOf(2,3,4,5)
    var bingo = (1..23).random()

    println(number)
    println(bingo in number)
}


const val MIN_AGE = 18
const val MAX_AGE = 78

fun main() {
    var age = (10..100).random()

    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}

