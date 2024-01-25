package com.rao.playground.part2oop

object OOPBasics {
  class Person(val name: String, age: Int) { // class definition also contains the definition of the constructor
    // inside we can define val, var, def
    // fileds (val or var)
    // methods = functions
    def greet(someone: String): String =
      s"$name says: Hi $someone"

    def greet(): String =
      s"Hello everyone, I am $name"

    val allCaps = name.toUpperCase()
  }

  val revanth = new Person("Revanth", 25) // revanth is the instance of person
  val revanthName = revanth.name // constructor arg is not necessarily a field ,
  // add val keyword to the arg in class to make it a field

  class Driver(firstName: String, lastName: String, val yearOfBirth: Int) {
    def fullName(): String =
      s"$firstName $lastName"
  }

  class Car(make: String, model: String, yearOfRelease: Int, owner: Driver) {
    def ownerAge(): Int =
      yearOfRelease - owner.yearOfBirth

    def isOwnedBy(driver: Driver): Boolean =
      driver == owner

    def copy(newYearOfRelease: Int): Car =
      new Car(make, model, newYearOfRelease, owner)

  }

  def main(args: Array[String]): Unit = {
    println(revanth.allCaps)
    println(revanth.greet("Arun"))
    println(revanth.greet())

    val driver = new Driver("Michael", "Schumacher", 1969)
    val driverImposter = new Driver("Michael", "Schumacher", 2024)

    val car = new Car("Ferrari", "F1", 2004, driver)

    println(driver.fullName())
    println(car.ownerAge())
    println(car.isOwnedBy(driver)) //true
    println(car.isOwnedBy(driverImposter)) //false
    println(car.copy(2005).ownerAge())
    println(s"Testing equality:${driver == driverImposter}") //false

  }
}
