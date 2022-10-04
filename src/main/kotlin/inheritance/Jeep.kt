package inheritance

class Dog(name : String) : Vehicle(name) {
    override fun move(){
        println("Goa Goa Goa")
    }
}