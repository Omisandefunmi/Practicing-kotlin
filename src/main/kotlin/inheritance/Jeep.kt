package inheritance

class Jeep(name : String) : Vehicle(name) {
    override fun move(){
        println("Moving like a jeep")
    }
}