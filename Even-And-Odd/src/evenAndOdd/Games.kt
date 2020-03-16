package evenAndOdd

import java.util.*
import kotlin.NullPointerException
import kotlin.math.floor

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Even-and-odd-games
 */

open class Games : EvenAndOdd {
    override var arg: String? = " "
    override var imput: Int? = 0
    override var choice: Int? = 0

    override var num: ()-> Int = { 0 }
    override var number: Int? = 0

    override fun playEvenAndOdd(): String {
        try {
            arg = arg ?: null
            println("Enter even or odd:")
            val arg: String = readLine()!!
            println("You entered: ${arg}")

            if (arg != "even" && arg != "odd") {
                return "Incorrect entry, enter even or odd"
            }
            choice = choice ?: null
            choice = (Math.floor(Math.random() * 9999999)+1).toInt()
            num = { choice!! % 2 }
            number = number ?: null
            number = num()

            val random: String = if (arg == "even") "odd" else "even"

            if (arg == "even" && number == 0 || arg == "odd" && number == 1) {
                return "You win! Choice: ${arg}, Computer: ${random}, Number: ${choice} is ${arg}"
            } else
                return "You lose! Choice: ${arg}, Computer: ${random}, Number: ${choice} is ${random}"
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }

    override fun numberInputEvenAndOdd(): String {
        try {
            imput = imput ?: null
            println("Enter a number:")
            val reader = Scanner(System.`in`)
            imput = reader.nextInt()
            println("You entered: ${imput}")

            if (imput !is Int) {
                throw Exception("Incorrect entry, enter a number")
            }
            num = { imput!! % 2 }
            number = number ?: null
            number = num()

            if (number == 0) {
                return "The number is even!"
            } else {
                return "The number is odd!"
            }
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }

    override fun randomEvenAndOdd(): String {
        try {
            choice = (Math.floor(Math.random() * 9999999)+1).toInt()
            choice = choice ?: null
            num = { choice!! % 2 }
            number = number ?: null
            number = num()

            val random: String = if (number == 0) "The number is even! ${choice}"
                else "The number is odd! ${choice}"
            return random
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }
}

