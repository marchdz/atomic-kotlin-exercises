// Destructuring/Task2.kt
package destructuringDeclarationsExercise2
import atomictest.eq

class Computation(
  val data: Int,
  val info: String,
)

operator fun Computation.component1() = data
operator fun Computation.component2() = info

fun evaluate(input: Int) =
  if (input > 5)
    Computation(input * 2, "High")
  else
    Computation(input * 2, "Low")

fun main() {
  val (value, description) = evaluate(7)
  value eq 14
  description eq "High"
}
