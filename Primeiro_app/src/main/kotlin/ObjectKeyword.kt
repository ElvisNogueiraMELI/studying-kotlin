import kotlin.random.Random

//Object permite com que seja necessaria apens uma instancia de um objeto a palavra objeto já cria um objeto
// (fica ago parecido com metodos estaticos mas aparentemente não é isso)
object RandonNumber {
    fun get(): Int{
        //É possivel usar bibliotecas do java no kotlin
        var objRandom = java.util.Random()
        return objRandom.nextInt(90)
    }
}

fun main() {

    println("Numero gerado é ${RandonNumber.get()}")
}