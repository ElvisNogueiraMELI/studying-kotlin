fun obterTeperatura(color: Color): String{
    return when(color){
        Color.VERMELHO, Color.LARANJA, Color.AMARELO -> "Quente"
        Color.VERDE -> "Neutro"
        Color.AZUL -> "Fria"
    }
}

fun main() {
    val temperatura = obterTeperatura(Color.AZUL)
    println(temperatura)
    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(1.5))
    println(whenAssign(2))
}

fun whenAssign(value: Any): Any{
    val result = when(value){
        "Hello" -> 1
        1 -> "one"
        is Double -> "true"
        else -> 42
    }

    return result;
}