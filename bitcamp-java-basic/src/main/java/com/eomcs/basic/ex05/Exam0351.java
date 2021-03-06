package com.eomcs.basic.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기
//
public class Exam0351 {
  public static void main(String[] args) {
    
    System.out.println(57 % 2);
    System.out.println(57 & 0b1);
    // %연산은 나누기 연산을 수행해야 한다.
    // 나누기 연산은 여러번의 계산작업을 수행한다.
    // 그에비해 &비트 연산은 한번만 하면된다.
    // - 짝수인지 홀수인지 알아내거나, 2의 나머지를 구하고싶다면 &비트 연산이 수행속도가 빠르다.
    // 어떤 값에 대해 2로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 1비트 값만 추출하면 된다. 
    // ex)
    //     0011 0110 (54)
    //   & 0000 0001
    //     ---------
    //     0000 0000 추출된 값은 0이므로 나머지가 없다.
    //
    //     0011 0101 (53)
    //   & 0000 0001 
    //     ---------
    //     0000 0001 나머지가 1임.
    
    
    System.out.println(57 % 4);
    System.out.println(57 & 0b11);
    // 어떤 값에 대해 4로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 2비트 값만 추출하면 된다.
    // 주의 &연산자를 사용하여 나머지값을 구하려면, 나누는값이 2의 제곱수여야한다.
    // 2진수의 특징.
    System.out.println(57 % 8);
    System.out.println(57 & 0b111);
    
    System.out.println(57 % 16);
    System.out.println(57 & 0b1111);
    
  }
}

