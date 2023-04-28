// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s: String) {
    var index: Int = 0
    while (index < s.length) {
        println(s[index])
        index += 1
    }
}

fun main() {
//  displayContent("abc")
}
/* Expected output:
a
b
c
*/