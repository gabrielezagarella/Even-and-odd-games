package evenAndOdd

import java.util.*

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Even-and-odd-games
 */

class Play(): Games() {

    fun play() {
        try {
            println("Enter your name :")
            val name: String = readLine()!!
            println("Enter your surname :")
            val surname: String = readLine()!!
            val nikname: String = name + " " + surname

            do {
                println("'*************************************************'")
                println("Welcome to the even and odd games ${nikname}")
                println("Choice: ")
                println("1 Random even and odd")
                println("2 Number input even and odd")
                println("3 Even and odd game")
                println("0 Exit")

                val reader = Scanner(System.`in`)
                imput = reader.nextInt()

                if (imput !is Int){
                    throw Exception("Incorrect entry, enter a number")
                }

                when (imput) {
                    1 -> println(super.randomEvenAndOdd())
                    2 -> println(super.numberInputEvenAndOdd())
                    3 -> println(super.playEvenAndOdd())
                    0 -> println("Bye, see you soon ${nikname}! \n*******************************'")
                    else -> {
                        println("Enter a number from 0 to 3, you have inserted ${imput}")
                    }
                }
            } while (imput != 0)
        }
        catch (e:NullPointerException){
            throw Exception("error")
        }
    }
}