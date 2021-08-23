enum class Color(val red: Int, val green: Int, val blue: Int){
    VERMELHO(255,0,0),
    LARANJA(255,165,0),
    VERDE(0,0,255),
    AZUL(0,0,255),
    AMARELO(0,255,255);

    fun decimalRGB() =  ((red * 256 + green) * 256 +blue);
}

fun main() {
    val redDecimalRGB = Color.VERMELHO.decimalRGB()
    println(redDecimalRGB);
}