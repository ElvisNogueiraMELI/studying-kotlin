package br.com.collection
/*
    Partition divide uma collection em duas:
    Collection 1: elementos em que a condição passada como parâmetro é true
    Collection 2: elementos em que a condição passada como parâmetro é false
 */
fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)

    val evenOdd = numbers.partition { it % 2 ==0 }
    println(evenOdd)

    //Você pode definir as coleções onde seram salvos os itens da collecton original
    val (even, odd) = numbers.partition { it % 2 ==0 }
    println("Par: $even")
    println("Impar: $odd")
}