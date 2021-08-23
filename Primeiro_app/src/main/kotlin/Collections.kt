/*
    ---------------ANOTATIONS---------------
    Collections (List, Set, Map) são por padrão imutaveis em Kotlin
    Uma Collection para ser mutável precisa ter o prefixo Mutable (MutableList, MutableSet e MubtableMap)
 */


class Player(val name: String, val number: Int){
    override fun toString(): String {
        return "$name : $number"
    }
}

class Team(val name: String, var squade: MutableList<Player>)


fun main() {
    val flamengo = Team("Flamengo", mutableListOf(Player("Arrascaeta", 14),Player("Gabigol",9)))
    flamengo.squade.add(Player("Bruno Henrique",27))

    //Set não permite itens repetidos
    val setCollection: Set<String> = setOf("Elvis", "Elvis", "Lana")

    //Map é uma colection chave/valor
    val mapCollection: MutableMap<Int, String> = mutableMapOf()
    mapCollection.put(10,"Diego Ribas")
    mapCollection.put(10,"Diego Ribas")
    mapCollection.put(9,"Gabigol")

    flamengo.squade.forEach(::println)
    println()
    setCollection.forEach { item -> println(item) }
    println()
    mapCollection.forEach(::println)
    println(mapCollection.get(10))


    val numbers = listOf(1, 2, -3, 4, -5, 6)
    //Filter
    //Ao usar esse tipo de função o nome padrão é it mas vc pode dar o nome que quiser ao item
    val positives = numbers.filter { number -> number > 0 }
    println("Numeros Positivos: $positives")

    val negatives = numbers.filter { number -> number < 0 }
    println("Numeros Positivos: $negatives")

    //map
    //Permite fazer transformações em todos os elementos de uma collection
    val triple = numbers.map { number -> 3 * number }
    println(triple)

    //Function any
    //Retorna true se a coleção tiver ao menos um item que dê match com a condição
    val flagHasPositive: Boolean = numbers.any { number -> number > 0 }
    println(flagHasPositive)

    //Function all
    //Retorna true se todos os elementos da coleção derem match com a condição
    var flagAllPositive: Boolean = numbers.all { number -> number > 0 }
    println(flagAllPositive)
    var flagAllLessThatTen: Boolean = numbers.all { number -> number < 10 }
    println(flagAllLessThatTen)

    //Function none
    //Retorna true se nenhum elemento der match com a condição
    var flagAllMoreThatTen = numbers.none { number -> number > 10 }
    println(flagAllMoreThatTen)
}