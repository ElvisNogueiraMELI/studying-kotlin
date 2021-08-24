package br.com.collection

fun main() {
    //minOrNull e maxOrNull retornam o menor e maior, respectivamente, elemento de uma lista. Caso a lista esteja vazia
    //ambas funções retornam null
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min: ${numbers.minOrNull()}, max: ${numbers.maxOrNull()}")
    println("Empty: $empty, min: ${empty.minOrNull()}, max: ${empty.maxOrNull()} ")
}