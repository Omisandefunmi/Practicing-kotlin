fun main(){
    var result = isPalindrome("madaM")
    println(result)
}

fun checkIfEven(number : Int) : Boolean{
    return number % 2 == 0
}

fun isPalindrome(number : String) : Boolean{
    var numberArray = number.lowercase().toCharArray();
    var count = 0
    var total = 0;
    while(count < number.length){
        if(numberArray[count] == numberArray[number.length-1-count]){
            total++
        }
        count++
    }
    if(total == number.length){
        return true
    }
    return false;
}