package br.com.scopeFunction

fun main() {

    var config: Configuration = Configuration("192.168.0.2", 8080)
    // with é uma foma mais concisa de usar um atributo de um objeto
    with(config) {
        println("$host:$port")
    }


}

class Configuration(var host: String, val port: Int)