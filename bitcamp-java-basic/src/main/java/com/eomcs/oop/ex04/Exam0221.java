// 인스턴스 메서드와 클래스 메서드의 활용 - wrapper 클래스
package com.eomcs.oop.ex04;

public class Exam0221 {
  public static void main(String[] args) throws Exception {

    Integer i1 = Integer.valueOf(100);
    Integer i2 = Integer.valueOf(200);
    Integer i3 = Integer.valueOf(300);

    //
    System.out.println(i2.compareTo(i1));
    System.out.println(i2.compareTo(i3));

    int v1 = i2.intValue();
    System.out.println(v1);

    // 스태틱 메서드 = 클래스 메서드 사용
    int v2 = Integer.parseInt("1280"); // 문자열을 숫자로 변환
    System.out.println(v2);
    String s1 = Integer.toBinaryString(77); // 2진수로 표기
    String s2 = Integer.toOctalString(77);  // 8진수로 표기
    String s3 = Integer.toHexString(77);    // 16진수로 표기
    System.out.printf("77 = %s, %s, %s\n", s1, s2, s3);

    Integer x1 = Integer.valueOf("44"); // 문자열에 있는 수를 10진수로 간주한다.
    Integer x2 = Integer.valueOf("44", 16); // [a 를 b 진수로 간주함 => 10진수로 변환후 출력]
    System.out.printf("%d, %d\n", x1, x2);

    float f = Float.parseFloat("3.14f");
    boolean b = Boolean.parseBoolean("true");
    System.out.printf("%f, %b\n", f, b);

  }
}





