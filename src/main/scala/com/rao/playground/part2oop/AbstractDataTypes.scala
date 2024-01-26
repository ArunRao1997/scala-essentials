package com.rao.playground.part2oop

object AbstractDataTypes {
  // abstract classes --.> cannot be instantiated i.e., val videoGame: VideoGame = new VideoGame
  abstract class VideoGame {
    // fields or methods without implementation are called as abstract
    val gameType: String

    def play(): Unit

    // can provide normal fields or methods
    def runningPlatform(): String = "PS5"
  }

  class Shooter extends VideoGame {
    override val gameType = "FPS"

    override def play(): Unit = println("Fire!")
  }

  // traits
  trait ThirdPerson {
    def showPerspective(game: VideoGame): Unit
  }

  // traits can extend other traits
  trait OpenWorld extends ThirdPerson {
    override def showPerspective(game: VideoGame): Unit =
      println("I see myself from back and also see an open world")
  }

  trait StoryLine {
    def mainCharacter: String
  }

  // abstract classe vs traits
  // a class can only extend ONE class but multiple traits
  class MassEffect extends VideoGame with OpenWorld with StoryLine {
    override val gameType: String = "Open-world story"

    override def play(): Unit = println("Saving the galaxy")

    override def mainCharacter: String = "Commander Shepherd"
  }

  def main(args: Array[String]): Unit = {
    val cs = new Shooter
    println(cs.runningPlatform())
  }
}
