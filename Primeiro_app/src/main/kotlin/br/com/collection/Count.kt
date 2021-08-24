package br.com.collection

fun main() {
    val names = listOf("Elvis", "Renan", "Ewerton", "Williany")

    //Count conta a quatidade de itens, podendo fazer um filtro usando uma condição
    val nNamesStartedWithE = names.count { it.startsWith("E") }
    val nNames = names.count()

    println(nNamesStartedWithE)
    println(nNames)
}