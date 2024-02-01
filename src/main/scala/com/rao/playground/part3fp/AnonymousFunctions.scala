package com.rao.playground.part3fp

object AnonymousFunctions {

  // apply
  // FunctionN
  var doubler: Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(n: Int) = n * 2
  }

  // function types // most frequently used
  var doubler_v2: Int => Int = (n: Int) => n * 2 // lambda, equivalent to the above doubler
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b // equivalent to new Function2[Int,Int,Int]{....}

  // Zero arg Functions Function0[A]
  val justDoSomething: () => Int = () => 42

  // alternate syntax with curly braces
  val stringToInt = {(string:String)=>
    // block of code
    val stringLength = string.length
    stringLength+45
  }

  // type inference
  val doubler_v3: Int => Int = n=> n*2 //type of arg is inferred
  val adder_v2:(Int,Int) => Int = (a,b) => a + b

  // shortest notation possible
  val doubler_v4: Int => Int = _ *2 // same as doubler_v3
  val adder_v3:(Int,Int) => Int = _ + _ // each _is a different argument // same as adder_v2
  def main(args: Array[String]): Unit = {
    println(doubler(4))
    println(doubler_v2(4))
    println(justDoSomething())

  }
}
