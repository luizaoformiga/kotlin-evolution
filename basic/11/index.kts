// Estruturas de controle

/*

if / else

when

elvis operator

Pode ser ecandeado com múltiplas estruturas;


*/

fun main() {
    var expression = 90

    if(expression == true) {
        println("OK deu tudo certo")
    } else {
        println("Não foi dessa vez")
    }
}


when {
    case1 -> {}
    case2 -> {}
    case3 -> {}
    case4 -> {}
    else -> {}
}


val a:Int? = null
var number = a ?: 0 // validando se a for nulo ele receber 0, senão for nulo ele recebe o valor de a.
