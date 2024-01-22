package com.rao.playground.part1basics

object Expressions {
  // Expressions are structures that evaluate to a value
  val meaningOfLife = 40 + 2
  //    ^^^^^^^expression

  // Expressions that compose of +,-,*,/, bitwise | &  >> <<
  val mathExpression = 2 + 3 * 4 //14
  // Boolean Expressions
  val equalityTest = 1 == 2 // expression returns True or False

  // If expressions
  val anIfExpression = if (equalityTest) 45 else 85
  val anIfExpression_v2 = if (equalityTest) then 45 else 85

  // code blocks are also expressions
  val aCodeBlock = {
    // can define local values
    val localValue = 78
    // bunch of expressions

    // last value = the value of entire block
    localValue + 100.2
  }

  // code blocks via indentation
  val aCodeBlock2 =
    // can define local values
    val localValue = 78
    // bunch of expressions

    // last value = the value of entire block
    localValue + 100.2

// pattern matching
val someValue = 42
val description = someValue match {
  case 1 => "The First"
  case 2 => "The Second"
  case 46 => "Meaning of Life"
  case _ => "Something else"

}

  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(equalityTest)
    println(anIfExpression)
    println(if (equalityTest) 45 else 99)
    println(anIfExpression_v2)
    println(aCodeBlock)
    println("description: "+description)
  }
}
