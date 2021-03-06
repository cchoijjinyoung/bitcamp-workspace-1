// 주제: 부동소수점을 저장하는 메모리의 크기

package com.eomcs.basic.ex03;

class Exam0320 // 클래스 선언(class declaration)
{ // 클래스 정의 (class definition)
    public static void main(String[] args) // 메서드 선언 (method declaration)
    { // 메서드 정의 (method definition)
        // 부동소수점 리터럴은 기본으로 8바이트(Double) 크기를 갖는다.
        System.out.println(3.14);
        System.out.println(3.14D); // D,d 붙여도 상관없음. 기본이 8바이트 이므로
        System.out.println(3.14d);
        
        System.out.println(3.14F); // F,f 를 붙이면 4바이트 메모리에 저장.
        System.out.println(3.14f);
        
        // d,D = Double 8바이트
        // f,F = Float  4바이트
    }
}
