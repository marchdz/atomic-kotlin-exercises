// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  var spaces = n - 1
  var chars = 1
  for (line in 1..n) {
    for (space in 1..spaces) {
      print(" ")
    }
    for (char in 1..chars) {
      print("#")
    }
    println()
    spaces -= 1
    chars += 2
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/