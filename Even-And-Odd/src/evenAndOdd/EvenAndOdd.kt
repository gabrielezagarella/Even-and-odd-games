package evenAndOdd

/** Comment Kdoc
 * @author Gabriele Zagarella
 * @since 1.0
 * @project Even-and-odd-games
 */

interface EvenAndOdd {
    var arg: String?
    var imput: Int?
    var num: ()-> Int
    var choice: Int?
    var number: Int?

    fun playEvenAndOdd(): String

    fun numberInputEvenAndOdd(): String

    fun randomEvenAndOdd(): String
}