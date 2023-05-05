// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
  val side1: Double = 1.0,
  val side2: Double = 2.0,
  val color: String = "yellow"
) {
  override fun toString(): String ="$color rectangle $side1 x $side2"
}

fun main() {
  println(Rectangle())

  println(Rectangle(2.0, 3.0, "green"))
  println(Rectangle(color = "red", side1 = 3.0, side2 = 2.0))
  println(Rectangle(side2 = 11.0))
}