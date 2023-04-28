// Properties/Task3.kt
package propertiesExercise3

import scopefunctions.whichGnome
import kotlin.math.absoluteValue

class Robot {
  var x = 0
  var y = 0

  fun right(steps: Int) {
    x = crossBoundary(x + steps)
  }

  fun left(steps: Int) {
    x = crossBoundary(x - steps)
  }

  fun down(steps: Int) {
    y = crossBoundary(y + steps)
  }

  fun up(steps: Int) {
    y = crossBoundary(y - steps)
  }

  fun getLocation(): String = "($x, $y)"

  private fun crossBoundary(number: Int): Int {
    val valueToReturn: Int = number % 100
    if (number < 0) return valueToReturn + 100
    return valueToReturn
  }
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/