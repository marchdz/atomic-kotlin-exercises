// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var originalNumber = number
  var worker = 0
  while (originalNumber > 0) {
    worker = worker * 10 + originalNumber % 10
    originalNumber /= 10
  }
  return worker
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}