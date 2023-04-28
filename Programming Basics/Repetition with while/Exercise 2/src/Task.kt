// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var numberToIncrease: Int = 0
  var finalNumber: Int = 0
  while (numberToIncrease <= number) {
    finalNumber += numberToIncrease
    numberToIncrease += 1
  }
  return finalNumber
}

fun main() {
  println(sum(10))  // 55
}