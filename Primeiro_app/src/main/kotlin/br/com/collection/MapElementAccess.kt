package br.com.collection

fun main() {
    val mapCollection: MutableMap<Int, String> = mutableMapOf()
    mapCollection.put(10,"Diego Ribas")
    mapCollection.put(10,"Diego Ribas")
    mapCollection.put(9,"Gabigol")

    //Para acessar o valor de um mapa pode se usar [key] ou .getValue(key)
    println(mapCollection[9])
    println(mapCollection.getValue(10))
    // Caso a key passada não exista no map o metodo getValue lança uma excessão de NoSuchElementException
    // Por sua vez caso use [key] será retornado um null
    try {
        mapCollection.getValue(15)
    }catch (e: NoSuchElementException){
        println("Message: $e")
    }
}