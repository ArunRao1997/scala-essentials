package com.rao.playground.part3fp

object ListsDemo {

  // singly linked list
  val aList: List[Int] = List.apply(1,2,3)

  // first element (head), rest of the list (tail)
  val firstElement: Int = aList.head
  val rest = aList.tail

  // add (prepend) an element to a list
  val biggerList = 0::aList // [0,1,2,3] returns a new list
  // add (append) an element at the end of the list
  val biggerList_v2 = aList:+ 4

  // utility methods
  val scalax5 = List.fill(5)("Scala") // ["Scala","Scala","Scala","Scala","Scala"]

  val reversedList = aList.reverse // new list [3,2,1]

  // concatenate with another list
  val concatenation = aList ++ List(4,5,6)

  // format the collection
  val stringRep = aList.mkString("|") //1|2|3
  val stringRep_v2 = aList.mkString("[",",","]") // [1,2,3]

  // combine all the elements in a list
  val total = aList.reduce((a,b)=>a+b)
  val total_v2 = aList.reduce(_+_)
  def main(args: Array[String]): Unit = {
    println(aList)
    println(biggerList)
    println(biggerList_v2)
    println(scalax5)
    println(reversedList)
    println(concatenation)
    println(stringRep)
    println(stringRep_v2)
    println(total)
    println(total_v2)
  }
}
