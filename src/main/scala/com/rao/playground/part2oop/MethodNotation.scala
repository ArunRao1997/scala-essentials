package com.rao.playground.part2oop

object MethodNotation {
  class Person(val name: String) {

    def greet(another: Person): String =
      s"$name says: Hi, ${another.name}, how are you?"
  }

  val alice1 = new Person("Alice") // starting in scala3 new keyword is not mandatory
  val alice = Person("Alice")
  val bob = Person("Bob")
  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))

  }
}
