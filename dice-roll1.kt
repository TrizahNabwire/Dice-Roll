fun main(){
  val diceRange = 1..6 // read as val diceRange: IntRange = 1..6
  val randomNumber = diceRange.random()
  println("Random Number : ${randomNumber}")
}
