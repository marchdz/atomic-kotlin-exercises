// Sets/Task3.kt
package setsExercise3
import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

fun countPercent(listToCheck: Set<String>, groceryCart: Set<String>) =
  groceryCart.intersect(listToCheck).size * 100.0 / groceryCart.size

fun percentMeat(groceryCart: Set<String>): Double =
  countPercent(meats, groceryCart)

fun percentFruit(groceryCart: Set<String>): Double =
  countPercent(fruits, groceryCart)

fun percentVeggies(groceryCart: Set<String>): Double =
  countPercent(vegetables, groceryCart)

fun percentOther(groceryCart: Set<String>): Double =
  groceryCart.subtract(meats + fruits + vegetables).size * 100.0 /groceryCart.size

fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}