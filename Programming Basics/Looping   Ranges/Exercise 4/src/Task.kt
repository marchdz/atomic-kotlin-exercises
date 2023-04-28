// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for (number in 1..n) {
//    for (timesToPrint in 1..number) {
//      print("#")
//    }
//    println()
    repeat(number) {
      print('#')
    }
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/