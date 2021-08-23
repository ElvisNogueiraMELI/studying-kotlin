//For

fun main() {
    val moviesWatched = listOf("Lord of the Rings", "Avengers", "Black Panther")
    for (movie in moviesWatched)
        println("I watched the movie $movie!")

    val locadora = Locadora(listOf(Dvd("Lord of the Rings"), Dvd("HP")))
    for (dvd in locadora)
        println(dvd.title)
}

class Dvd(val title: String)

class Locadora(val dvds: List<Dvd>){
    operator fun iterator(): Iterator<Dvd> {
        return dvds.iterator()
    }
}