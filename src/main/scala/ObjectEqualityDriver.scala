
package com.knoldus

object ObjectEqualityDriver extends App {

  private val objectEquality = new ObjectEquality

  private val firstList = List(1, 2, 3, 4, 5)
  private val secondList = List(1, 2, 3, 4, 5)
  private val thirdList = List(6, 7, 8, 9, 0)

  // Two List referring to same point
  private val listA = thirdList
  private val listB = thirdList

  println(s"First List : $firstList")
  println(s"Second List : $secondList")
  println(s"Third List : $thirdList")

  println("\nLists Referring to Same Point - ")
  println(s"List A : $listA")
  println(s"List B : $listB")

  println("\nEQUALS METHOD -----------------------------------------------------------------\n")

  // using equals method
  private val equalsMethodOnSimilarList = objectEquality.equalsMethod(firstList, secondList)
  private val equalsMethodOnDiffList = objectEquality.equalsMethod(firstList, thirdList)
  private val equalsMethodOnListReferringToSame = objectEquality.equalsMethod(listA, listB)

  println(s"First List equals Second List : $equalsMethodOnSimilarList")
  println(s"First List equals Third List : $equalsMethodOnDiffList")
  println(s"List A equals List B : $equalsMethodOnListReferringToSame")

  println("\nDOUBLE EQUALS OPERATOR --------------------------------------------------------\n")

  // using == operator
  private val doubleEqualToOnSimilarList = objectEquality.doubleEqualsOperator(firstList, secondList)
  private val doubleEqualToOnDiffList = objectEquality.doubleEqualsOperator(firstList, thirdList)
  private val doubleEqualToOnListReferringToSame = objectEquality.doubleEqualsOperator(listA, listB)

  println(s"First List == Second List : $doubleEqualToOnSimilarList")
  println(s"First List == Third List : $doubleEqualToOnDiffList")
  println(s"List A == List B : $doubleEqualToOnListReferringToSame")

  println("\nNOT EQUALS OPERATOR -----------------------------------------------------------\n")

  // using != operator
  private val notEqualToOnSimilarList = objectEquality.notEqualsOperator(firstList, secondList)
  private val notEqualToOnDiffList = objectEquality.notEqualsOperator(firstList, thirdList)
  private val notEqualToOnListReferringToSame = objectEquality.notEqualsOperator(listA, listB)

  println(s"First List != Second List : $notEqualToOnSimilarList")
  println(s"First List != Third List : $notEqualToOnDiffList")
  println(s"List A != List B : $notEqualToOnListReferringToSame")

  println("\nNE METHOD ---------------------------------------------------------------------\n")

  // using ne method
  private val neMethodOnSimilarList = objectEquality.neMethod(firstList, secondList)
  private val neMethodOnDiffList = objectEquality.neMethod(firstList, thirdList)
  private val neMethodOnListReferringToSame = objectEquality.neMethod(listA, listB)

  println(s"First List ne Second List : $neMethodOnSimilarList")
  println(s"First List ne Third List : $neMethodOnDiffList")
  println(s"List A ne List B : $neMethodOnListReferringToSame")

  println("\nEQ METHOD ---------------------------------------------------------------------\n")

  // using eq method
  private val eqMethodOnSimilarList = objectEquality.eqMethod(firstList, secondList)
  private val eqMethodOnDiffList = objectEquality.eqMethod(firstList, thirdList)
  private val eqMethodOnListReferringToSame = objectEquality.eqMethod(listA, listB)

  println(s"First List eq Second List : $eqMethodOnSimilarList")
  println(s"First List eq Third List : $eqMethodOnDiffList")
  println(s"List A eq List B : $eqMethodOnListReferringToSame")

}
