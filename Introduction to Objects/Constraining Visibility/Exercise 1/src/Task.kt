// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien (
    public val name: String,
    public val species: String,
    private var planet: String
) {
    fun movePlanet(destination: String) {
        planet = destination
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
  val firstAlien = Alien("Arthricia", "Cat Person", "PurgePlanet")
  println(firstAlien)
  firstAlien.movePlanet("Earth C-137")
  println(firstAlien)
  val secondAlien = Alien("Dale", "Giant", "Gearworld")
  println(secondAlien)
  secondAlien.movePlanet("Parblesnops")
  println(secondAlien)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/