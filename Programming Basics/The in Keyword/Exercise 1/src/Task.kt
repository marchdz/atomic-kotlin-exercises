// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  val chars = 'a'..'z'
  var alphabet: String = ""
  for (char in chars) {
    alphabet += char
  }
  return alphabet
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}