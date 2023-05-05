// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var countParenthesis = 0
  for (char in input) {
    when (char) {
        '(' -> countParenthesis +=1
        ')' -> countParenthesis -= 1
        ' ' -> {}
        else -> throw IllegalArgumentException()
    }
    if (countParenthesis < 0) return false
  }
  return countParenthesis == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}