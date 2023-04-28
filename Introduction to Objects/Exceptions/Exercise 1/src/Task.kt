// Exceptions/Task1.kt
package exceptionsExercise1

fun main() {
  println("Can't be converted to double: 1,2")

  val strings = listOf("12", "1.2", "1,2", "1.2e0", "1.2e1",
    "1.2e2", "1.2e3", "1.2e10", "12.3e10",
    "1.2e-1", "1.2e-10")

  for (string in strings) {
    val convertedString = string.toDoubleOrNull()
    if (convertedString != null) println(convertedString)
  }
}
