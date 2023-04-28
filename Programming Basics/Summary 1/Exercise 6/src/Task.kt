// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  val sWithoutSpaces = s.replace(" ", "")
  for (char in 4 .. sWithoutSpaces.length step 5) {
    println(sWithoutSpaces[char])
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/