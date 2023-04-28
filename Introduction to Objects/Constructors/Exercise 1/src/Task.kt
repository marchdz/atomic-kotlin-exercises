// Constructors/Task1.kt
package constructorsExercise1

class Floating ( val d: Double) {
  override fun toString(): String = d.toString()
}


fun main() {
  val exercise = Floating(5.0)
  println(exercise)
}