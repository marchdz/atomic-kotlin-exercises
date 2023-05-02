// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var ocurrences = 0
  for (value in list) {
    if (value == number) {
      ocurrences += 1
    }
  }
  return ocurrences
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}