package com.rao.playground.part1basics

object Recursion {

  // sum(3) = 1+2+3 =6
  //sum(10) = 1+2+3+..+10=55
  def sum(n: Int): Int =
    if (n <= 0) 0
    else n + sum(n - 1)

  def printN(string: String, n: Int): Unit =
    if (n <= 0) ()
    else {
      println(string)
      printN(string, n - 1)
    }

  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)

    // last expression is the final thing
    if (n <= 0) false // don't support negative numbers
    else if (n == 1) false // 1 is not a prime (not a composed number)
    else testDivisors(2)
  }


  def concatenateN(string: String, n: Int): String =
    if (n <= 0) ""
    else string + concatenateN(string, n - 1)

  def fibonacci(n: Int):Int =
    if(n<=1) 1
    else if(n==2) 2
    else fibonacci(n-1) + fibonacci(n-2)

  def main(args: Array[String]): Unit = {
    println(sum(10))
    printN("Scala is awesome", 20)
    println(isPrime(17))
    println(concatenateN("Scala",5))
    println(fibonacci(7))
  }
}
