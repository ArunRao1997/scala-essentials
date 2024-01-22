package com.rao.playground.part1basics

object Functions {

  //function = mini-program/ reusable piece of code that we can parameterize

  def aFunction(a: String, b: Int): String = {
    // always a single expression
    a + " " + b
  }

  val anInvocation = aFunction("Scala", 999)

  // functions returning Unit
  // Unit == "void" in other languages e.g., java, C, C++
  def aVoidFunction(aString: String): Unit =
    println(aString)

  // we can do a lot inside the impl of a function
  def aFunctionWithSideEffects(aString: String): String =
    println(aString) // side effects
    aString + " " + aString // last expression gets "returned"

  // can define smaller functions inside bigger functions
  def aBigFunction(n: Int): Int = {
    // can define smaller functions
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    // can call the smaller functions just inside this ccode block
    aSmallerFunction(n, n + 1)
  }


  def main(args: Array[String]): Unit = {
    println(anInvocation)
    println(aBigFunction(2))
  }
}
