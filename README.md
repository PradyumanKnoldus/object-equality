# Object Equality

A program illustarting 'equals' , '==', '!=' , 'ne', and 'eq' with different methods on how they can be used for different purpose.

This is a Scala code that defines a class ObjectEquality with five methods that can be used to compare objects in different ways.

### Method Signatures 

equalsMethod: This method takes two objects of any type T and checks if they are equal using the equals method.

    def equalsMethod[T](firstObject: T, secondObject: T): Boolean
    
doubleEqualsOperator: This method takes two objects of any type T and checks if they are equal using the == operator.

    def doubleEqualsOperator[T](firstObject: T, secondObject: T): Boolean
    
notEqualsOperator: This method takes two objects of any type T and checks if they are not equal using the != operator.
    
    def notEqualsOperator[T](firstObject: T, secondObject: T): Boolean
    
neMethod: This method takes two objects of type T <: AnyRef and checks if they refer to different objects using the ne method.

    def neMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean
    
eqMethod: This method takes two objects of type T <: AnyRef and checks if they refer to the same object using the eq method.

    def eqMethod[T <: AnyRef](firstObject: T, secondObject: T): Boolean

> All of these methods take two parameters of type T and return a boolean value indicating whether the two objects are equal or not. The neMethod and eqMethod methods also use a type bound (<: AnyRef) to ensure that only reference types are compared.


