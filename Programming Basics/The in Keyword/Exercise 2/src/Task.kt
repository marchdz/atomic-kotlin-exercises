// InKeyword/Task2.kt
package theInKeywordExercise2

fun sumOfEven(n: Int): Int {
  var result = 0
  for (number in 0..n step 2) {
    result += number
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}