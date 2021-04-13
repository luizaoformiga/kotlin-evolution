// Nullability

/* 

Qualquer tipo pode ser nulo, porem isso deve ser explicitado na declaraçao de variavel atraves do uso da interrogaçao (?)

A interferencia de tipo nao atribui nullability

*/ 

var moth:Int? = null
// atribui valor null corretamente a moth

var day:Int = null 
// Erro de compilacao


// operadores aritmeticos

//soma

a + b //expressao
a.plus(b) // comando
a += b //atribuicao


// subtracao

a - b //expressao
a.minus(b) // comando
a -= b //atribuicao


//multiplicaçao

a * b //expressao
a.times(b) // comando
a *= b //atribuicao


// divisao


a / b //expressao
a.div(b) // comando
a /= b //atribuicao


// funçao para somar dois valores
fun main() {
    val count = 10
    val times = 9
    var runner = times + count 

    println(runner)
    println(count.plus(times))
}