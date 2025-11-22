package Day7;

public class Whatisabstraction {

 //   A class that is declared as abstract is known as an abstract class. It can have abstract
   // and non-abstract methods. It needs to be extended and its method implemented. It
    //cannot be instantiated.
    //Important points of Abstract class:
    //An abstract class must be declared with an abstract keyword.
    //It can have abstract and non-abstract methods.
    //It cannot be instantiated (object creation).
    //It can have constructors and static methods also.
    //It can have final methods which will force the subclass not to change the body of the method

    //Important rules for abstract methods:
      //      1. Abstract methods don’t have the body, they just have method signature.
        //    2. If a class has an abstract method it should be declared abstract, the vice versa is nottrue,
    //    which means an abstract class doesn’t need to have an abstract methodcompulsory.
//3. If a regular class extends an abstract class, then the class must have to implement all
  //          the abstract methods of abstract parent class or it has to be declared abstract as well.
    //        4. Any class that contains one or more abstract methods must also be declared abstract
//5. The following are various illegal combinations of other modifiers for methods with respect to abstract modifier:
    //a. final - abstract
    //b. abstract static
    //c. abstract private

}
