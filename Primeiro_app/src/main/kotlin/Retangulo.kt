class Retangulo(val altura: Int, val largura:Int) {
    val isQuadrado: Boolean
        get() {
            return altura==largura;
        }
}

fun main() {
    val retangulo1: Retangulo = Retangulo(10,10)
    val retangulo2: Retangulo = Retangulo(4,12)

    println(retangulo1.isQuadrado)
    println(retangulo2.isQuadrado)
}