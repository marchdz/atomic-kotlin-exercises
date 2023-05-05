// Overloading/Task4.kt
package overloadingExercise4
import atomictest.eq

fun f(n: Int = 0, value: Int) = n + value

fun main() {
  f(value = 373) eq 373
}