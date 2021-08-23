fun main() {
    println(max(5,13));
    println(max1(3,4));
}

fun max(a: Int, b: Int): Int{
    return if (a>b) a else b;
}

fun max1(a:Int, b: Int): Int = if (a>b) a else b;