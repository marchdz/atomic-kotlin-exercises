// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  hours.toLong() * 3600000 + minutes.toLong() * 60000 + seconds.toLong() * 1000

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}