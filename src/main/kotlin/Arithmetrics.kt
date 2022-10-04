fun main(){
    val num: Int = 2
    val num2: Int = 7
    val num3: Int = 10

    val add = num + num3 - num2
    println("$num + $num3 = $add")

    val modulo = num3 % num2
    println("$num3 % $num2 = $modulo")

    val subtract = num3 - num - num2
    println("$num3 - $num - $num2 = $subtract")

    val division = num / num3
    println("$num / $num3 = $division")

    val multiply = num * num3 * num2
    println("$num * $num3 = $multiply")
}