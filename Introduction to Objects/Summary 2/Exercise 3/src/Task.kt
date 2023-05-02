// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val maxObjects: Int) {
    private val listOfObjects = mutableListOf<Any>()

    val size: Int
        get() = listOfObjects.size

    val full: Boolean
        get() = listOfObjects.size == maxObjects

    fun add(newObject: Any) {
        if (full) throw IllegalStateException("The container is full")
        listOfObjects.add(newObject)
    }
}

fun main() {
/*
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
*/
}