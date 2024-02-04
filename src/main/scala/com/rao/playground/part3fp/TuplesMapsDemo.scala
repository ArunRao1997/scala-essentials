package com.rao.playground.part3fp

object TuplesMapsDemo {

  // tuples
  val aTuple = (2, "Scala Rocks")
  val aTuple_v1: (Int, String) = (2, "Scala Rocks")
  val firstField = aTuple._1
  val secondField = aTuple._2

  // tuples of 2 elements have some syntax sugar
  val aTuple_v2 = 2 -> "Scala Rocks" // same as tuple

  // maps: keys -> values, unique keys
  val aMap = Map()

  val phoneBook = Map(
    "Jim" -> 964,
    "Jane" -> 678,
    "Jill" -> 342
  )

  // core methods
  // key exists in the map
  val hasJane = phoneBook.contains("Jane") // true
  val JanesPhoneNumber = phoneBook("Jane") // 678, but it will crash if the key is not in the map

  // add a new pair - returns new map
  val newPair = "Mary" -> 678
  val newPhoneBook = phoneBook + newPair // new map

  // remove a key
  val noJill = phoneBook - "Jill" // new map

  // list of tuples <-> maps
  val listOfEntries = List(
    "Jim" -> 964,
    "Jane" -> 678,
    "Jill" -> 342
  )

  val phoneBook_v2 = listOfEntries.toMap
  val listOfEntries_v2 = phoneBook.toList

  // set of keys
  val allNames = phoneBook.keySet // ["Jim", "Jane", "Jill"]
  val allNumbers = phoneBook.values.toList // [555, 921, 123] - not necessarily in this order

  def main(args: Array[String]): Unit = {
    println(aTuple)
    println(aTuple_v1)
    println(aTuple_v2)
    println(firstField)
    println(secondField)

    println(hasJane)
    println(JanesPhoneNumber)

    println(phoneBook_v2)
    println(listOfEntries_v2)

    println(allNames)
    println(allNumbers)
  }


}
