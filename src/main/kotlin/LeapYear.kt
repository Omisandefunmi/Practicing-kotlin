fun main(){
    println("Enter year")
    val year = Integer.valueOf(readLine())
    if((year % 4 == 0) and (year % 100 != 0)){
        println("It is a leap year")
    }
    else if((year % 400 == 100) and (year % 100 == 0)){
        println("It is a leap year")
    }
    else{
        println("It is not a leap year")
    }
}