// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result: String = ""
  for (index in 0 until  s.length step 2) {
    result += s[index]
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/