fun main(){
    var number = 100
    var total = 0
    while (number in 1..100){
        total += number
        number--
    }
    println("sum is $total")
}