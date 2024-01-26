package com.rao.playground.part2oop

object Objects {
  //singleton pattern
  object MySingleton { // MySingleton type and the ONLY possible instance of that type
    // define fields and methods
    val aField = 45
    def aMethod(x: Int) = x + 1
  }

  val theSingleton = MySingleton
  val anotherSingleton = MySingleton

  class Person(name:String){
    def sayHi():String = s"Hi, my name is $name"
  }

  // combo of class + object of the same name in the same file = companions
  object Person{ // object with same name = companion objects
    // define "static" fields and methods that don't depend on particular instance of class
    val N_EYES = 2
    def canFly():Boolean = false
  }
  //objects can extend classes/traits
  object BigFoot extends Person("Big Foot")
  /*
  Scala --> JVM bytecode
  class with a static void main(args:Array[String])

  java: class MyApplication{
    public static void main(String[] args){
    }
  }

  scala: object MyApplication{
  def main(args: Array[String]): Unit = {
  }
  }

  static ~ object , void ~ Unit
   */
  def main(args: Array[String]): Unit = {
    println(theSingleton == anotherSingleton)
    println(MySingleton.aField)
    println(MySingleton.aMethod(5))
  }
}
