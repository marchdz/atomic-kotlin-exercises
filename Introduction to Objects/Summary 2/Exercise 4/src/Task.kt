// Summary2/Task4.kt
package summaryIIExercise4
import atomictest.capture
import atomictest.eq
import kotlin.IllegalArgumentException

class Dictionary {
    private val _translations = mutableMapOf<String, List<String>>()

    internal val translations: Map<String, List<String>>
        get() = _translations

    internal fun addTranslations(word: String, values: String) {
        if (_translations.contains(word)) {
            throw IllegalArgumentException("Dictionary already has translations for '$word'")
        }
        _translations += word to values.split(" ")
    }
}

fun main() {

  val dictionary = Dictionary()
  dictionary.addTranslations("apple", "Apfel")
  dictionary.addTranslations("cake", "Kuchen Torte")

  dictionary.translations eq mapOf("apple" to listOf("Apfel"),
    "cake" to listOf("Kuchen", "Torte"))

  capture {
    dictionary.addTranslations("cake", "Törtchen")
  } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"


  // shouldn't compile:
//  dictionary.translations.remove("apple")
}