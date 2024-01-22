package com.rao.playground.part1basics

object ControlStructures {

  // instructions are executed vs expressions are evaluated
  // do this, do that, repeat(10) {....} - imperative programming
  // 2 + 3, IO effects, map, flatMap, filter - functional programming

  // Everything in Scala is an expression

  val printing: Unit = println("This is an instruction") // side effect
  val theUnit: Unit = () // the only possible value of type U nit

  // instructions - code blocks returning units
  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction1")
    println("Instruction2")
  }

  // variables in scala
  var aVariable = 10
  val reassignment: Unit = aVariable += 2


  def main(args: Array[String]): Unit = {
    println(printing == theUnit)
    // loops in scala
    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }

  }

}
