fun main() {
    val numbers = intArrayOf(4,5,6,8,8,5,5)

    if(8 !in numbers){
        println("5 is not in number")
    }
    else{
        println("5 is in number")
    }

    println(numbers[4])
    numbers[4] = 8
    println(numbers[4])

    val number1: Int = 55
    val number2 : Long = number1.toLong()

}