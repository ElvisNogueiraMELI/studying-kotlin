class Item(val name: String, val price: Float)
class Order(val itemList: List<Item>)

// Estou adicionando um metodo a classe Order fora de seu escopo
fun Order.maxPriceItem(): String{
    var itemMoreExpansive: Item = Item("", 0F)
    if (itemList.isEmpty())
        return "NO_PRODUCTS"
    for (item in itemList){
        if (item.price > itemMoreExpansive.price)
            itemMoreExpansive = item
    }

    return itemMoreExpansive.name
}

fun Order.maxPriceItemWithLambda(): String{
    /* MaxByOf é uam função do kotlin para listas que enconta o objeto dentro da lista com o maior valor do campo
       especificado para busca.
       A interrogação antes de .name significa que eu aceito que o valor poderá vir null. A segunda diz que caso eu
       rceba um null quero retornar a String que vem depois
     */
    return this.itemList.maxByOrNull { item -> item.price }?.name ?: "NO_PRODUCTS"
}

fun main() {
//    val order = Order(listOf(Item("Sorvete 1L",23.3F), Item("Alface",1.5F)))
    val order = Order(listOf())
    println(order.maxPriceItem())
    println(order.maxPriceItemWithLambda())
}