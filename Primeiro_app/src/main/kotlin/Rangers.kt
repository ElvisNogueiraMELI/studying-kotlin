fun main() {
    //Mostra os valores de 0 a 3
    for (i in 0..3) {
        print(i)
    }
    println("")

    //Mostra os valores enquanto é menor que o limite
    for (i in 0 until 3)
        print(i)
    println("")

    //Mostra os valores do intervalo, incluindo os limites, soamando o valor especificado depois do step
    for (i in 0..8 step 2) {
        print(i)
    }
    println("")

    //Mostra os valores do intervalo, incluindo os limites, em ordem decrescente
    for (i in 3 downTo 0)
        print(i)
    println("")

    for (i in 9 downTo 0 step 2)
        print(i)
    println("")

    for (c in 'a'..'g')
        print(c)
}
