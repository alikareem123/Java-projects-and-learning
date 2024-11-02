class Dog(val name: String, val breed: String, val age: Int = 0) {
    init {
        bark(name)
    }
    private fun bark(name: String){
        println("$name  Woof")
    }
}