package com.rao.playground.part2oop

import com.sun.org.apache.xml.internal.security.algorithms.Algorithm

object MethodNotation {
  class Person(val name: String) {

    def greet(another: Person): String =
      s"$name says: Hi, ${another.name}, how are you?"

    // here infix keyword is optional, just to explicitly let others know that it's infix
    infix def likes(movie: String): String =
      s"$name says: I adore the movie $movie!!!"

    def ?!(another: Person): String =
      s"$name says: Hey! ${another.name}, how could you do this?"

    def apply(proLang: String): Unit =
      println(s"[$name] programming in $proLang")

    def apply(proLang: String, algorithm: String): Unit =
      println(s"[$name] programming in $proLang, applying the algorithm $algorithm")
  }

  val alice1 = new Person("Alice") // starting in scala3 new keyword is not mandatory
  val alice = Person("Alice")
  val bob = Person("Bob")

  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice greet bob) // exactly same as above line - infix notation
    //     ^^^^^  ^^^^^  ^^^
    //  instance  method argument
    // infix notation only works on methods with 1 argument
    println(alice.likes("Batman"))
    println(alice likes "Superman")

    println(alice.?!(bob))
    println(alice ?! bob) // infix
    alice.apply("Scala")
    alice("Scala") // same as above line
    alice("Scala", "Dynamic Programming")
  }
}
