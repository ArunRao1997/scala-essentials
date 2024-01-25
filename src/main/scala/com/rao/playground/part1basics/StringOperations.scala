package com.rao.playground.part1basics

object StringOperations {

  // Strings have functions attached to them
  val aString = "Scala Rocks"
  val length = aString.length

  val startsWithScala = aString.startsWith("Scala")

  val combine = aString + " very much!"

  val findIndex = aString.indexOf("Rocks")

  val name = "Arun"
  val age = 25
  val greeting = s"My name is $name and I am $age years old." // s-interpolated string
  val greeting2 = s"My name is $name and I will be turning ${age+1} this january."
  def main(args: Array[String]): Unit = {
    println(length)
    println(startsWithScala)
    println(combine)
    println(findIndex)
    println(greeting)
    println(greeting2)
  }
}
