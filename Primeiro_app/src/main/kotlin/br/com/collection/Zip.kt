package br.com.collection

fun main() {
    /*
        zip function merges two given collections into a new collection. By default, the result collection contains Pairs
        of source collection elements with the same index. However, you can define own structure of the result collection
        element. The size of the result collection equals to the minimum size of a source collection.
     */
    val listA = listOf("a","b", "c", "d")
    val listB = listOf(1,2,3)

    val resultPairs = listA zip listB
    println(resultPairs)

    val resultReduce = listA.zip(listB) { a, b -> "$b$a" }
}