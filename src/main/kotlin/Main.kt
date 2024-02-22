fun main() {
    println("Hello Consolata")
    println()

    modulus(98, 56)

    modulus(78, 45)

    addFourNumbers(20, 40, 60, 80)

    interestingFact(" I like reading.")
}
fun name(name: String){
    println(name)
}
fun modulus(num1: Int, num2: Int): Int{
    var result = num1 % num2
    println(result)
    return result
}

fun addFourNumbers(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}
fun interestingFact(word:String){
    println(word)
}