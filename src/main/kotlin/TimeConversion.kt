import java.util.Scanner
import kotlin.system.exitProcess

fun main(){
   val input = Scanner(System.`in`)

    println("Enter time between in 24-hour format e.g 15:00")
    val timeInput = input.nextLine()

    if (timeInput.length > 5 || timeInput.length < 5){
        println("Invalid time format")
        exitProcess(0)
    }
    val index: Int = timeInput.indexOf(":")
    val hour = Integer.valueOf(timeInput.substring(0, index))
    val minutes = timeInput.substring(index + 1, timeInput.length)

    if (hour < 12){
        println("0$hour:$minutes am")
    }

    else{
        val convertedHour = hour % 12
        println("$convertedHour:$minutes pm")

    }

}

//class InvalidTimeFormatException(message: String, statusCode: Int) : Throwable() {
//
//}
