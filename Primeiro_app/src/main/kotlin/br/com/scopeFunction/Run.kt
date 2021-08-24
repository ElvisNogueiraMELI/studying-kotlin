package br.com.scopeFunction

fun main() {
    var numbersEmpty: List<Int>? = null
    var number = listOf(1,2,3)
    numbersEmpty = numbersEmpty?.run {
        this
    }?: listOf()
    println(sumList2(number))
}

/*
    run é uma função utilizada para fazer null-check. Quando um objeto chama essa função o bloco de codigo do let é
    executado e retorna a ultima expressão do bloco.
    O objeto pode ser acesado dentro do bloco através do this
 */

fun sumList2(listNumber: List<Int>):Int {
    val soma: Int = listNumber?.run {
        sum()
    }
    return soma
}