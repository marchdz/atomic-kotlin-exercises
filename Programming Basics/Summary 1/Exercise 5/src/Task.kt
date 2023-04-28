// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  for (number in start + 4..end step 5) {
    println(number)
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/