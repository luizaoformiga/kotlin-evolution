// Atribuição

val maxValue = if (a > b) a else if (a < b) b else b

val  minValue = if (a > b) {
    println("b($b) é menor valor")
    b
} else if (a < b) {
    println("a($a) é o maior valor")
    a
} else {
    println("os valores são iguais")
    b
}

//O valor atribuido tem que estar na última linha do bloco

// A condicional pode não usar chaves se só fizer atribuição

/*

 when

 equivalente ao switch de outras linguagens

 aceita tanto valores quanto condicionais

 aceita como case
*/


when {
    a > b -> {}
    a != b a > c -> {}
    a == 0 -> {}
    else -> {}
}

when(year) {
    -4000..75 -> // antiguidade
        476..1547 -> // medieval
    1456..1789 -> // moderna
    currentYear -> // ano atual
}

// Elvis operator
fun main() {
    val a:Int? = null
    val b:Int = 80
    val c:Int? = 9

    var number = a?: b?: 0

    println(number)
}