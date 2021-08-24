package br.com.collection

//Retorna o item de uma coleção associado a determinada posição ou key, caso seja um mapa. Caso a posição definida não
// existir ele retornará um um valor default

fun main() {
    val listB = listOf(1,2,3)
    //Retorna 42 caso o index 1 não exista
    println(listB.getOrElse(0) {42})
    println(listB.getOrElse(3) {42})
}

