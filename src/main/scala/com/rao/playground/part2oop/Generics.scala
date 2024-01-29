package com.rao.playground.part2oop

object Generics {

  // 1 -> 2 -> 3 -> 4 -> 5 = linkedlist
  abstract class IntList {
    def first: Int

    def rest: IntList
  }

  class EmptyIntList extends IntList {
    def first: Int = throw new NoSuchElementException()

    def rest: IntList = throw new NoSuchElementException()
  }

  case class NonEmptyIntList(a: Int, r: IntList) extends IntList {
    def first: Int = a

    def rest: IntList = r
  }

  abstract class AnyList {
    def first: Any

    def rest: AnyList
  }

  class EmptyAnyIntList extends AnyList {
    def first: Any = throw new NoSuchElementException()

    def rest: AnyList = throw new NoSuchElementException()
  }

  case class NonEmptyAnyList(a: Any, r: AnyList) extends AnyList {
    def first: Any = a

    def rest: AnyList = r
  }

  // type parameters = generics
  abstract class MyList[A] {
    def first: A

    def rest: MyList[A]

    def isEmpty: Boolean
  }

  class EmptyList[A] extends MyList[A] {
    def first: A = throw new NoSuchElementException()

    def rest: MyList[A] = throw new NoSuchElementException()

    def isEmpty: Boolean = true
  }

  case class NonEmptyList[A](a: A, r: MyList[A]) extends MyList[A] {
    def first: A = a

    def rest: MyList[A] = r

    def isEmpty: Boolean = false
  }

  // can add type arguments/generics to traits, abstract classes, case classes, normal classes

  // can add multiple type arguments to classes, traits
  trait MyMap[K, V]

  // can add type args for methods
  def second[A](list: MyList[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else if (list.rest.isEmpty) throw new NoSuchElementException()
    else list.rest.first

  def main(args: Array[String]): Unit = {
    //val numbers = NonIntEmptyList(1,NonIntEmptyList(2,NonIntEmptyList(3, new EmptyIntList)))
    val numbers = NonEmptyList(1, NonEmptyList(2, NonEmptyList(3, new EmptyList)))
    val firstNumber = numbers.first
    val strings = NonEmptyList("Scala", NonEmptyList("rocks", new EmptyList))
    val firstString = strings.first
    println(second(numbers)) // 2
    println(second(strings)) // rocks
  }
}
