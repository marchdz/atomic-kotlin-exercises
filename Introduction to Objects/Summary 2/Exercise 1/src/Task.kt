// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq
import atomictest.neq

class Boring {
    fun a(): Double = 1.618
    fun b(): String = "ratio"
    fun c(): Int = 11
}

fun main() {
  val testingFunctions = Boring()
  testingFunctions.a() eq 1.618 neq 2.0
  testingFunctions.b() eq "ratio" neq "other"
  testingFunctions.c() eq 11 neq 12
}