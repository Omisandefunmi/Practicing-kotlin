package inheritance

    fun main(){
        var vehicle = Vehicle("Vehicle")
        var jeep = Jeep("Lexus")
        jeep.move()
        var car = Car("Corolla")
        car.move()
    }