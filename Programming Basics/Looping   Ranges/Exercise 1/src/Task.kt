// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var result: Long = 1
  for (number in 1..n) {
    result *= number
  }
  return result
}

fun main() {
  println(factorial(10))  // 3628800
}