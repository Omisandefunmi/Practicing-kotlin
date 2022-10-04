package inheritance

open class Vehicle (var name : String) {
    init {
        println("I am a Vehicle")
    }
    open fun move(){
        println("Moving like a vehicle")
    }
}