package br.com.scopeFunction

fun main() {
    var numbersEmpty: List<Int>? = null
    var number = listOf(1,2,3)
    numbersEmpty = numbersEmpty?.let {
        it
    }?: listOf()
    println(sumList(numbersEmpty!!))
}

/*
    let é uma função utilizada para fazer null-check. Quando um objeto chama essa função o bloco de codigo do let é
    executado e retorna a ultima expressão do bloco.
    O objeto pode ser acesado dentro do bloco através da palavra it
 */

fun sumList(listNumber: List<Int>):Int {
    val soma: Int = listNumber?.let {
        it.sum()
    }
    return soma
}