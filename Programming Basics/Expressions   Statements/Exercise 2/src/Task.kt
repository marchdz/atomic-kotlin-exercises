// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber

fun g(firstString: String, secondString: String) = "$firstString$secondString"

fun h() = println("h()")

fun main() {
  val sum: Int = f(1, 3)
  val concatenation: String = g("First", "Second")
  val print: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}