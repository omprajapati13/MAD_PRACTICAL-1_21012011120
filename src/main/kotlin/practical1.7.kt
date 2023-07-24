fun main()
{
    print("Enter a number: ")
    var num = readLine()!!.toInt()
    var factorial = Factorial(num)
    print("Factorial of $num is $factorial")

}

fun Factorial(num: Int): Long {
    return if (num >= 1) {
        num * Factorial( num -1)
    }
    else {
        1
    }
}