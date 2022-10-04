package inheritance

class Car(name : String) : Vehicle(name) {
    override fun move() {
        println("Moving like a car")
    }
}
