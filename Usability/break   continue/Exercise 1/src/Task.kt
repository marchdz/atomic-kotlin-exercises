// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum = 0
  for (element in n) {
    when {
        element == "0" -> break
        element.toIntOrNull() == null -> trace("Not a number: $element")
        else -> sum += element.toInt()
    }
  }
  trace("Sum: $sum")
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}