fun main() {
    val team1 = setOf("Peterson", "Adriano", "Bruno", "Mayara", "Luana", "elvis")
    val team2 = setOf("Peterson", "Adriano", "Bruno", "Mayara", "Luana", "elvis")
    val team3 = setOf("elvis","Peterson", "Adriano", "Bruno", "Mayara", "Luana")

    //verifica se as coleções possuem os mesmos itens independente da ordem que aparecem
    if (team1 == team2)
        println("A lista do time 1 é igual a do 2")

    if(team1 == team3)
        println("A lista do time 1 é igual a do 3")

    if (team1 === team2)
        println("A lista do time 1 é igual a do 2, inclusive na mesma ordem")

    if(team1 === team3)
        println("A lista do time 1 é igual a do 3")
    else
        println("A lista do time 1 não é igual a do 3, opossuem referncia diferente")
}

