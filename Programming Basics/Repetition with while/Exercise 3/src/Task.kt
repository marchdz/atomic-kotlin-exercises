// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var increasingNumber: Int = 0
  var finalNumber = 0
  while (increasingNumber <= n) {
    if (increasingNumber % 2 == 0) {
      finalNumber += increasingNumber
    }
    increasingNumber +=1
  }
  return finalNumber
}

fun main() {
  println(sumOfEven(10))  // 30
}