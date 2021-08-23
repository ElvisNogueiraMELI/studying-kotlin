fun main() {
    println(stack(1))
    println(stack("Oi"))
}

fun <E> stack(item: E): E{
    return item;
}