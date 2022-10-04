import java.util.*
import kotlin.system.exitProcess

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter time between in 24-hour format e.g 15:00")
    val timeInput = scanner.nextLine()

    if (timeInput.length > 5 || timeInput.length < 5){
        println("Invalid time format")
        exitProcess(0)
    }
    val index: Int = timeInput.indexOf(":")
    val hour = Integer.valueOf(timeInput.substring(0, index))
    val minutes = timeInput.substring(index + 1, timeInput.length)

    when(hour){
        in 1..12 -> println("$hour:$minutes am")
        in 13..23 -> println("${hour % 12}:$minutes pm")
    }
}