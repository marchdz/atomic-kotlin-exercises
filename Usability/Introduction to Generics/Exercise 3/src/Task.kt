// IntroGenerics/Task3.kt
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<E> (
    private val elementsMap: MutableMap<E, Int> = mutableMapOf()
) {
    fun add(element: E) {
        elementsMap[element] = (elementsMap[element] ?: 0) + 1
    }

    fun count(element: E): Int = elementsMap[element] ?: 0

    fun toSet(): Set<E> = elementsMap.keys
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}