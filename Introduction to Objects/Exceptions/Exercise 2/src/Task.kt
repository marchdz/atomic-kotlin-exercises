// Exceptions/Task2.kt
package exceptionsExercise2
import atomictest.capture
import atomictest.eq
import java.lang.Exception

fun abort(s: String) {
  throw Exception(s)
}

fun main() {
  capture {
    abort("Stop!")
  } eq "Exception: Stop!"
}