package br.com.collection

fun main() {
    val unorderList = listOf(-1,-6,15,0)

    println("Números desordenados: $unorderList")
    println("Números ordenados asc: ${unorderList.sorted()}")
    println("Números ordenados desc: ${unorderList.sortedBy { -it }}")
    println("Números ordenados desc: ${unorderList.sortedDescending()}")
}