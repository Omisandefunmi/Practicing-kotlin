import com.sun.jdi.IntegerValue
import java.util.*

fun main(){
    val ch: Char = 'A'
    when(ch){
        'A', 'E', 'I', 'O', 'U' -> println("$ch is a vowel")
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> println("$ch is a number")
        else -> println("$ch is a consonant")
    }

    println("Enter any character")
    val character = readLine()?.uppercase()
    when(character){
        "A", "E", "I", "O", "U" -> println("$character is a vowel")
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" -> println("$character is a number")
        else -> println("$character is a consonant")
    }

    println("Enter any number")
    val w : Int = Integer.valueOf(readLine())
    when(w){
        in 1..10 -> println("A positive number less than 11")
        in 10..100 -> println("A positive number between than 10 and 100")
    }
}