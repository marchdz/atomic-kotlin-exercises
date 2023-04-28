// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val helper = x
  x = y
  y = helper
  println(x)
  println(y)
}