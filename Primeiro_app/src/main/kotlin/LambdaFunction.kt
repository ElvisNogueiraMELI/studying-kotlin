/*
    ---------------ANOTATIONS---------------
    As funções lambdas como o foreach do java precisar estar entre chave e não parenteses
    Ex.:

                list.foreach{item -> println(item.name)}
 */


fun main() {
    println(upperCase("Elvis"))
    println(lowerCase("Elvis"))
}

val upperCase: (String) -> String = String::toUpperCase
val lowerCase: (String) -> String = {str -> str.toLowerCase()}