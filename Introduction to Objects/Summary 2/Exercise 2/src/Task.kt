// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

class Boring2(val a: Double, val b: String, val c: Int) {
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val testingFunctions = Boring2(3.6, "text", 7)
  testingFunctions.a() eq 3.6
  testingFunctions.b() eq "text"
  testingFunctions.c() eq 7
}