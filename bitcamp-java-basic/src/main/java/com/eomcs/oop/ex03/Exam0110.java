package com.eomcs.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    // 인스턴스 변수
    class A {
      // instance variable = non-static field
      int v1;
      boolean v2;
    }

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;
    obj1.v2 = true;
    obj2.v2 = true;
    obj3.v2 = true;
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
  }
}
