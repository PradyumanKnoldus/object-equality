package com.knoldus

import scala.util.{Failure, Success, Try}

class ObjectEquality {

  // equals method - checks if two objects are equal
  def equalsMethod[T](firstObject: T, secondObject: T): Boolean = {
    Try(firstObject.equals(secondObject)) match {
      case Success(value) => value
      case Failure(_) => false
    }
  }

  // == operator - checks if two objects are equal
  def doubleEqualsOperator[T](firstObject: T, secondObject: T): Boolean = {
    Try(firstObject == secondObject) match {
      case Success(value) => value
      case Failure(_) => false
    }
  }

  // != operator - checks if two objects are not equal
  def notEqualsOperator[T](firstObject: T, secondObject: T): Boolean = {
    Try(firstObject != secondObject) match {
      case Success(value) => value
      case Failure(_) => false
    }
  }

  // ne method - checks if two references refer to different objects
  def neMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean = {
    Try(firstObject.ne(secondObject)) match {
      case Success(value) => value
      case Failure(_) => false
    }
  }

  // eq method - checks if two references refer to the same object
  def eqMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean = {
    Try(firstObject.eq(secondObject)) match {
      case Success(value) => value
      case Failure(_) => false
    }
  }
}
