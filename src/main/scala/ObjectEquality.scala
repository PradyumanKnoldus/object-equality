
package com.knoldus

class ObjectEquality {

  // equals method - checks if two objects are equal
  def equalsMethod[T](firstObject: T, secondObject: T): Boolean = {
    firstObject.equals(secondObject)
  }

  // == operator - checks if two objects are equal
  def doubleEqualsOperator[T](firstObject: T, secondObject: T): Boolean = {
    firstObject == secondObject
  }

  // != operator - checks if two objects are not equal
  def notEqualsOperator[T](firstObject: T, secondObject: T): Boolean = {
    firstObject != secondObject
  }

  // ne method - checks if two references refer to different objects
  def neMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean = {
    firstObject.ne(secondObject)
  }

  // eq method - checks if two references refer to the same object
  def eqMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean = {
    firstObject.eq(secondObject)
  }

}
