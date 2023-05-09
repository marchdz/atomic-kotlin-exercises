// IntroGenerics/Task1.kt
package introductionToGenericsExercise1
import atomictest.eq

fun <T> List<T>.secondOrNull(): T? = if (size < 2) null else get(1)

fun <T> List<T>.penultimateOrNull(): T? = if (size < 2) null else get(size - 2)

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull() eq 2
  ints.penultimateOrNull() eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull() eq "b"
  strings.penultimateOrNull() eq "c"
}