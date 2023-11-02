//inheritance-Reusing the existing class functionality and adding extra new features.
//what we get-code reusability.
//Every parent class in java is an object.
//There are differnt types of inheritances;
// 1)simple inheritance
// 2)multiple inheritance
// 3)multi-level inheritance
// 4)hierachical/hybrid inheritance
// 5)cyclic inheritance.

//simple inheritance-It is possible

class A{

}
class B extends A{

}

//multiple inheritance-It is not possible in java bcoz every parent class is an object

class A{

}
class B{

}
class C extends A,B{

}

//multi-level inheritance-It is possible

class A{

}
class B extends A{

}
class C extends B{

}
class D extends C{

}


//hierachical/hybrid inheritance-It is possible

class A{

}
class A1 extends A{

}
class A2 extends A{

}

//cyclic inheritance-Not applicable in any programming language.