package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ObjectEqualityTest extends AnyFlatSpec {

  "equalsMethod" should "return true for equal objects" in {
    val obj1 = "Hello"
    val obj2 = "Hello"
    val objEq = new ObjectEquality()
    assert(objEq.equalsMethod(obj1, obj2) === true)
  }

  it should "return false for unequal objects" in {
    val obj1 = "Hello"
    val obj2 = "World"
    val objEq = new ObjectEquality()
    assert(objEq.equalsMethod(obj1, obj2) === false)
  }

  "doubleEqualsOperator" should "return true for equal objects" in {
    val obj1 = "Hello"
    val obj2 = "Hello"
    val objEq = new ObjectEquality()
    assert(objEq.doubleEqualsOperator(obj1, obj2) === true)
  }

  it should "return false for unequal objects" in {
    val obj1 = "Hello"
    val obj2 = "World"
    val objEq = new ObjectEquality()
    assert(objEq.doubleEqualsOperator(obj1, obj2) === false)
  }

  "notEqualsOperator" should "return true for unequal objects" in {
    val obj1 = "Hello"
    val obj2 = "World"
    val objEq = new ObjectEquality()
    assert(objEq.notEqualsOperator(obj1, obj2) === true)
  }

  it should "return false for equal objects" in {
    val obj1 = "Hello"
    val obj2 = "Hello"
    val objEq = new ObjectEquality()
    assert(objEq.notEqualsOperator(obj1, obj2) === false)
  }

  "neMethod" should "return true for different objects" in {
    val obj1 = new Object()
    val obj2 = new Object()
    val objEq = new ObjectEquality()
    assert(objEq.neMethod(obj1, obj2) === true)
  }

  it should "return false for the same object" in {
    val obj1 = new Object()
    val obj2 = obj1
    val objEq = new ObjectEquality()
    assert(objEq.neMethod(obj1, obj2) === false)
  }

  "eqMethod" should "return true for the same object" in {
    val obj1 = new Object()
    val obj2 = obj1
    val objEq = new ObjectEquality()
    assert(objEq.eqMethod(obj1, obj2) === true)
  }

  it should "return false for different objects" in {
    val obj1 = new Object()
    val obj2 = new Object()
    val objEq = new ObjectEquality()
    assert(objEq.eqMethod(obj1, obj2) === false)
  }

}

