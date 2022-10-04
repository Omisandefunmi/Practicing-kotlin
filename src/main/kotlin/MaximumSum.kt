import java.util.Scanner
fun main(){
    var scanner = Scanner(System.`in`)
    println("Enter the first number: ")
    var input = scanner.nextInt();

    println("Enter the second number: ")
    var input2 = scanner.nextInt()

    var sum = input + input2
    var max = if(input > input2){
        input
    }else if(input2 > input){
        input2
    }
    else{
        input
    }
    println("The sum  of $input and $input2 is $sum")
    println("The maximum number is $max")
}