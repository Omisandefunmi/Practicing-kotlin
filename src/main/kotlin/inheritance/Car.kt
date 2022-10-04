package inheritance

class Cat(name : String) : Vehicle(name) {
    override fun move() {
        println("Meow Meow Meow")
    }
}
