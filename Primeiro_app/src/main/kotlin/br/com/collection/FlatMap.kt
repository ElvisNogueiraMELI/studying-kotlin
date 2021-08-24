package br.com.collection

fun main() {
    /*
        O flatMap permite que eu possa unir o conteúdo de duas listas diferentes em apenas uma
     */
    //Classe Jogadores está definida em AssociatedByAndGroupBy.kt
    val jogador1: Jogador = Jogador("Gabibol", 9, 22, "Brasil")
    val jogador2: Jogador = Jogador("Bruno Henrique", 27, 12, "Brasil")
    val jogador3: Jogador = Jogador("De Arrascaeta", 14, 9, "Uruguai")

    val team = listOf(jogador1, jogador2, jogador3)
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)

    //Criei uma lista que guarda duas listas
    val mix = listOf(team, numbers)
    println("Lista que guarda outras duas listas: $mix")

    //Criei um map com a lista de mix que guarda uma lista com duas listas
    val mapMix = mix.map { it }
    println(mapMix)
    //Criei um flatMap dos elementos de mix, o qual consiste em uma lista única com os elementos de duas listas distintas
    val  flatMapMix = mapMix.flatMap { it }
    println(flatMapMix)
    
}