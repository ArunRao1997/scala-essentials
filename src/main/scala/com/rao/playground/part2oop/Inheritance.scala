package com.rao.playground.part2oop

object Inheritance {

  class VideoGame {
    val gameType = "interactive"

    def play(): Unit = println("Game running")
  }

  // single class inheritance
  class Shooter extends VideoGame {
    // can define own fields/methods
    def multiplayer(): Unit =
      play()
      println("boom, boom!")

  }

  val crisis = new Shooter

  // Inherit constructor
  class Person(val name: String, age: Int)

  class Adult extends Person("John Doe", 28) // Must specify constructor arguments

  val adult = new Adult

  class Adult2(name: String, age: Int) extends Person(name, age)

  val adult2 = new Adult2("Ryan", 32)

  // overriding => provide a new implementation for the methods in derived classes
  class RPG extends VideoGame {
    override val gameType = "Role-Playing"
    override def play(): Unit = println("Level-up")
  }

  val wow = new RPG

  // sub-type polymorphism
  val awe:VideoGame = new RPG // declare val of  parent-type and provide an instance of a derived type

  //anonymous classes
  val  psychonauts = new VideoGame {
    override val gameType = "Platformer"
  }

  def main(args: Array[String]): Unit = {
    println(crisis.gameType)
    crisis.multiplayer()
    println(adult.name)
    println(wow.gameType)
    wow.play()
    println(awe.gameType)
    awe.play()
  }

}
