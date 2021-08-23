//Para que uma classe possa ser herdada por outra (ser a mãe) ela precisa estar marcada como "open" para permitir a herança
open class Dog{
    //Os metodos que precisarem ser sobrescritos devem estar também marcados com "open"
    open fun sayHello(){
        println("Au au au")
    }
}

//A classe Yorkshire extende de Dog e implementa o construtor default
class Yorkishire : Dog(){
    //O método que vai ser sobrescrito deve estar marcado com override
    override fun sayHello(){
        println("Wif wif wif")
    }
}

fun main() {
    val yorkshire: Dog = Yorkishire();
    val dog : Dog = Dog()

    yorkshire.sayHello()
    dog.sayHello()
    val cachorro: Cachorro = Cachorro(4,"Vento Cinzento", "Cinza")
    println(cachorro fala "opa")
}

// ---------------------------------------------------------------------------------------------------------------------

//Herança com construtores parametrisados

open class Animal(val quantityPatas: Int, val name: String){
    open fun message(){
        println("O $name tem $quantityPatas patas")
    }
}

infix fun Cachorro.fala(string: String): String{
    return "O $name tem $quantityPatas patas e tem o pelo $color"
}
class Cachorro (quantityPatas: Int, name: String, val color: String): Animal(quantityPatas = quantityPatas, name = name)

