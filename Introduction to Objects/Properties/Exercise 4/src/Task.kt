// Properties/Task4.kt
package propertiesExercise4

class Counter {
  var value = 0

  private val myConstant = 10

  fun inc() {
    value += myConstant
  }

  fun dec() {
    value -= myConstant
  }
}