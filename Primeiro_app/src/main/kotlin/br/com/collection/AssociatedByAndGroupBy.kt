package br.com.collection

fun main() {
    //Cria um Map em que o campo number é a key(chave) e o próprio objeto é o value (valor)
    val numberBook = team.associateBy { it.number }
    println(numberBook)

    //Cria um map em que o primeiro parametro é a chave e o segundo é o valor
    val nameBook = team.associateBy(Jogador::name,Jogador::number)
    println(nameBook)

    //Cria um Map que a chave é o campo passado como parametro e os valores são os objetos que possuem o parametro chave
    //iguais
    val coutryBook = team.groupBy { it.country }
    println(coutryBook)

    //Cria um Map que a chave é o campo passado como parametro e os valores são os campos que aparecem como  segundo
    // parametro
    val testeBook = team.groupBy(Jogador::country, Jogador::name)
    println(testeBook)
}

/*
    Funções associateBy e groupBy criam maps a partir dos elementos de uma coleção indexada pela chave especificada.
    A chave é definida no keySelectorparâmetro. Você também pode especificar um opcional valueSelectorpara definir o que
    será armazenado no do valueelemento do mapa.
*/



//Classe Jogador
class Jogador(val name: String, val number: Int, var goals: Int, var country: String){
    override fun toString(): String {
        return "[name=$name, number=$number, goal=$goals, country=$country]"
    }
}

val jogador1: Jogador = Jogador("Gabibol", 9, 22, "Brasil")
val jogador2: Jogador = Jogador("Bruno Henrique", 27, 12, "Brasil")
val jogador3: Jogador = Jogador("De Arrascaeta", 14, 9, "Uruguai")

val team = listOf(jogador1, jogador2, jogador3)



