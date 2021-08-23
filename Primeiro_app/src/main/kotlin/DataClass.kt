data class Time(val id: Long, val nome: String){
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

fun main() {
    val time1 = Time(1,"Flamengo")
    val time2 = Time(2,"Vasco")
    val time3 = Time(3, "Palmeiras")

    //To String
    println(time1)

    //Copy
    var time4 = time1.copy()
    println(time4)
    //Copia mudando campos especificos
    time4 = time1.copy(2)
    println(time4)
}