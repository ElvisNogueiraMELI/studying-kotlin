
//Permite passar uma função como parametro e/ou retornala
fun calculate(x: Int, y: Int, operation: (Int,Int) -> Int): Int{
    return operation(x,y)
}

/*
    Outra forma de escrever essa função seria:

    fun sum(x: Int, y: Int) = x + y
 */

fun sum(x: Int, y: Int): Int{
    return x+y
}

fun sub(x:Int, y: Int): Int{
    return x - y
}

fun multiply(x:Int, y: Int): Int{
    return x * y
}

fun division(x:Int, y: Int): Int{
    return x / y
}

fun main() {
    val x: Int = 4
    val y: Int = 3
    val totalSum = calculate(x,y,::sum)
    val totalSub = calculate(x,y,::sub)
    val totalMultiply = calculate(x,y,::multiply)
    val totalDivision = calculate(x,y,::division)

    println("A soma de $x e $y é igual a $totalSum")
    println("A subtração de $x e $y é igual a $totalSub")
    println("A multiplicação de $x e $y é igual a $totalMultiply")
    println("A divisão de $x e $y é igual a $totalDivision")
}