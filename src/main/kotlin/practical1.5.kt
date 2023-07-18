fun main()
{
    print("Enter any number beetween 1 and 12: ")
    var num = readLine()!!.toInt()
    when (num) {
        1 -> print("January")
        2 -> print("February")
        3 -> print("March")
        4 -> print("April")
        5 -> print("May")
        6 -> print("June")
        7 -> print("July")
        8 -> print("August")
        9 -> print("septmber")
        10 -> print("Octomber")
        11 -> print("November")
        12 -> print("December")

        else ->{
            print("$num is not beetween 1 and 12, Enter a correct number!")
        }
    }
}