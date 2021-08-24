package br.com.scopeFunction

fun main() {
    // also faz uma acão com o objeto que está sendo referenciado. Usado para passar algo como parametro
    val jake = Person("Jake",30).also { println(it) }
}