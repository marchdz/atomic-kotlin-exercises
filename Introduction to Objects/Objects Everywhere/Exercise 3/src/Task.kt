// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var sLettersOnly = ""
  for (char in s) {
    if (char in 'a'..'z' || char in 'A'..'Z') {
      sLettersOnly += char
    }
  }
  return isPalIgnoreCase(sLettersOnly)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}