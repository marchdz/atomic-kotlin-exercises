// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val setOf25Numbers = mutableSetOf<Int>()
  var counter = 0
  while (setOf25Numbers.size < 25) {
    setOf25Numbers += Random.nextInt(25) + 1
    counter += 1
  }
  return counter
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}