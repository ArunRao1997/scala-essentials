package com.rao.playground.part2oop

object CaseClasses {
  // Light-weight data structures
  case class Pet(name: String, age: Int) {
    // Define fields and methods
  }

  // 1) Class constructor arguments auto-promoted to fields
  val dino = new Pet("Dino", 2)
  val dinoAge = dino.age

  // 2) Case classes can be built without the `new` keyword
  val dino_v2 = Pet("Dino", 2) // `new` is not mandatory

  // 3) toString, equals, hashCode (Any type)
  class PetSimple(name: String, age: Int)

  val dinoSimple = new PetSimple("Dino", 2)
  val dinoSimple_v2 = new PetSimple("Dino", 2)

  // 4) Utility methods, e.g., copy
  val dinoYounger = dino.copy(age = 1) // New instance of Pet with the same data, EXCEPT the argument passed

  // 5) Case classes have companion objects already created with an apply method with the same signature as the constructor
  val dino_v3 = Pet.apply("Dino", 2) // Pet("Dino", 2) is the same as Pet.apply("Dino", 2) for case classes

  // 6) Case classes are serializable - for parallel/distributed systems (e.g., AKKA/Peeko)
  // 7) Case classes are eligible for pattern matching

  // Case objects
  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  // Case objects are used to define hierarchies of data structures; some are their own types
  trait Message

  case class InitialInteraction(message: String) extends Message
  // Other case classes

  case object EndConversation extends Message

  // Pattern matching
  // Some external method
  def getMessage(): Message =
    InitialInteraction("Hello")

  val message: Message = getMessage()
  val contents = message match {
    case InitialInteraction(someContent) => s"I have received: $someContent"
    case EndConversation => "End of chat"
  }

  def main(args: Array[String]): Unit = {
    println(dinoSimple.toString)
    println(dino.toString)
    println(dinoSimple == dinoSimple_v2) // Here it compares with the reference object
    println(dino == dino_v2) // For case classes, equality compares data, not the reference object
    println(dinoYounger)
    println(contents)
  }
}
