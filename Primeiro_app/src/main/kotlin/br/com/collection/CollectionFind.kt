fun main() {
    var words = listOf("Lets", "find", "some", "somewhere", "something")
    //Function find
    //Retorna o primeiro item que achar que dá match com a condição
    val firstWord = words.find { word -> word.startsWith("so") }
    println(firstWord)

    //Function findLast
    //Retorna o último item que achar que dá match na coleção com a condição passada
    val lastWord = words.findLast { word -> word.startsWith("so") }
    println(lastWord)

    //Function first
    //Retorna o primeiro item de uma coleção, ou o primeiro que dá match caso seja passad uma condição
    val numbers = listOf(1, 2, -3, 4, -5, 6)
    val first = numbers.first()
    println(first)

    val firstEven = numbers.first { it%2 == 0 }
    println(firstEven)

    //Function last
    //Retorna o último item de uma coleção, ou o último que dá match caso seja passad uma condição
    val last = numbers.last()
    println(last)

    val lastOdd = numbers.last { it%2 != 0 }
    println(lastOdd)

    //Function firstOrNull
    //Retorna o primeiro item de uma coleção, ou o primeiro que dá match caso seja passad uma condição, caso não encontre
    //nenhum match retorna null
    val firstWordNull = words.firstOrNull { word -> word.startsWith('g') }
    println(firstWordNull)

    //Function lastOrNull
    //Retorna o último item de uma coleção, ou o último que dá match caso seja passad uma condição
    //nenhum match retorna null
}