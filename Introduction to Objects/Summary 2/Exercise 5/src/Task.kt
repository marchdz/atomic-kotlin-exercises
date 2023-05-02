// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg va1Numbers: Int) {
    println("va1:")
    for (number in va1Numbers) {
        println(number)
    }
}

fun va2(vararg va2Numbers: Int) {
    println("va2:")
    va1(*va2Numbers)
}

fun main() {

  va1(1, 2, 3)
  va2(4, 5, 6)

}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */