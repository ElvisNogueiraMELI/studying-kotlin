fun main() {
    infix fun Int.times(str: String): String = str.repeat(this)

    println(2 times "Elvis ")

    val corrida1 = Corrida("F1 Silverstone")
    corrida1 subscribe "Hamilton"
    corrida1 subscribe "Verstapen"

    println(corrida1.driversList)
    startRace("Vai", "go", "ahora")

    // Para permitir que uma variavel possa ser lida como null é preciso colocar o sinal '?' na declaração
    var nullable: String? = "opa"
    nullable = null

    println(nullable)
    //Enviando null
    println(nullString(null))
    //Enviando conteudo
    println("Elvis")

}

fun startRace(vararg messages: String){
    for (m in messages)
        println(m)
}

fun nullString(str: String?): String{
    if(str != null){
        return "O conteúdo da String é $str!"
    }else{
        return "A string está nula!"
    }

}

class Corrida(nameRace: String){
    var driversList = mutableListOf<String>()

    infix fun subscribe(nameDriver: String){
        driversList.add(nameDriver)
    }
}

