package br.com.elvis.pacoteA

fun nome(): String{
    return "Pacote A"
}

fun main() {
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
    val monthList = month.replace("(","").replace(")","").split("|")
    for (mes in monthList)
        println(mes)
}