import java.util.Scanner
fun main(){
    val a = -9
    val b = -11
    val max = if(a>b){
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    }
    else{
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }

    println("max = $max")

    val input = Scanner(System.`in`)
    println("Enter a number")
    val n1 = input.nextInt()


    println("Enter a number")
    val n2 = input.nextInt()

    println("Enter a number")
    val n3 = input.nextInt()

    val maximum = if(n1 > n2){
        if (n1 > n3)
            n1
        else
            n3
    }
    else{
        if (n2 > n3)
            n2
        else
            n3
    }
    println("maximum = $maximum")
}