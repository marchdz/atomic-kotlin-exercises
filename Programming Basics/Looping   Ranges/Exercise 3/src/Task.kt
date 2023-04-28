// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var result = 0
  for (number in 1..n) {
    if (number % 2 == 0) {
      result += number
    }
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}