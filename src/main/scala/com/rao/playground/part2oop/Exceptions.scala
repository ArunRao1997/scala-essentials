package com.rao.playground.part2oop

object Exceptions {
  /*
  Hierarchy
  Throwable
  -Error - JVM-related crashes (out of memory, stack overflow)
  -Exception - User facing crashes
  -RuntimeException
  ^^ can define new exceptions
   */

  class MyException extends RuntimeException("Too big of a number over-flowing Int!") {

  }
  def sumN(n: Int): Int =
    if (n < 0) throw new IllegalArgumentException("Negative numbers unsupported")
    else if (n >= 50000) throw new RuntimeException("Too big of a number over-flowing Int!")
    else if (n == 0) 0
    else n + sumN(n - 1)

  // try-catch
  val attempt = try {
    // block of code that might crash
    println(sumN(-9))
  } catch {
    case e: IllegalArgumentException => -1
    case e: RuntimeException => Int.MaxValue
    case mye: MyException => Int.MaxValue
  }

  // another way of declaring try-catch
  val attempt_v2 =
    try
      // block of code that might crash
      println(sumN(-9))
    catch
      case e: IllegalArgumentException => -1
      case e: RuntimeException => Int.MaxValue

  def main(args: Array[String]): Unit = {
    //println(sumN(-9))
    println(attempt)
  }
}
