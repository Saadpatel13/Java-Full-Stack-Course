package com.inheritances;

class Grandparent {
     Grandparent() {
        System.out.println("Method in Grandparent");
    }
}

class Parent extends Grandparent {
     Parent() {
        System.out.println("Method in Parent");
    }
}

class Child extends Parent {
     Child() {
        System.out.println("Method in Child");
    }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        Child child = new Child();
//        child.grandparentMethod(); 
//        child.parentMethod();     
//        child.childMethod();       
    } 
}
