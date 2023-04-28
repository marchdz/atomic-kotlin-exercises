// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(4, 3, 7) eq 14 neq 15
  sum(2, 5, 8) eq 15 neq 14
  sum(1, 6, 10) eq 17 neq 18
  sum(1, 1, 1) eq 3 neq 2
  sum(10, 10, 10) eq 30 neq 20
}