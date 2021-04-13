// funçoes de ordem superior

// exemplos

val x = calculate(12, 4, :: sum)
val y calculate(12, 4){ a, b -> a * b}


fun main() {
    val some:Int

    some calculate(34, 90) {a, b -> println("Vou calcular!") a * b }

    println(some)
}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calulation(n1:Int, n2:Int, operation:(Int, Int) -> Int):Int {
    val result = operation(n1, n2)
    return result
}