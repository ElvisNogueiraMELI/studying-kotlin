package br.com.scopeFunction

class Person(var nome: String, var idade: Int){
    override fun toString(): String {
        return "nome = $nome, idade = $idade"
    }
}

fun main() {
    var jake = Person("Elvis",24)
    //Apply é usado para retornar um objeto com os parametos passados dentro do bloco. É usado parainicializar objetos
    val elvis = jake.apply {
        nome = "Elvis"
        idade = 25
    }.toString()

    println(elvis)
}