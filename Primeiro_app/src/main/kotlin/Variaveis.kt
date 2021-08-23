fun main() {
    //Variável imutável
    val nome: String = "Elvis";
    //Variável mutável
    var idade: Int = 23;
    idade = 24;

    println("Olá meu nome é $nome e tenho $idade anos!");
    println("A soma é: ${soma(10,20)}");
}

fun soma(a: Int, b:Int): Int{
    return a+b;
}