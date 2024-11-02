
data class CoffeeDetails(val name: String, val sugarAmount: Int, val flavor: String, val size: String)


fun main() {
    val dennisCoffee = CoffeeDetails("cappuccino", 12, "caramel", "X")
//    var age: Int = 0
//
//    age = readln().toInt()
////    if (age in 18..31){
////        println("old enough")
////    }
//    when (age) {
//        32 -> {
//            println("too old")
//        }
//        30 -> {
//            println("Middle ages")
//        }
//        29 -> {
//            println("boundary touching")
//        }
//    }
//    val remarks = when{
//        age == 37 -> "Remarkable"
//        age in 18..29 -> "workable"
//        else -> "too young"
//    }
//    print(remarks)

    // Immutable List
    val shoppingList = listOf("Monitor", "Graphics Card", "RAM", "CPU")

    val mutableShoppingList = mutableListOf("Monitor", "Graphics Card", "RAM", "CPU")

    for(item in mutableShoppingList){
        print("Items are ${item} ")
    }
    var hasRam = mutableShoppingList.contains("RAM")
    when (hasRam) {
        true -> {
            println("It has Ram")
        }
        false -> {
            print("It doesn't has Ram")
        }
    }

    for(index in 0 until shoppingList.size){
        println(shoppingList[index])
    }

//    makeCoffee(4)
//    var daisy = Dog("Daisy", "Shepherd")
//    println("${daisy.name} is of ${daisy.breed} breed and its age is ${daisy.age}")
}
fun makeCoffee(sugarCount: Int){
    println("Coffee with $sugarCount spoons of sugar")
}
fun divide(num1: Int, num2: Int): Double{
    return (num1 / num2).toDouble()
}