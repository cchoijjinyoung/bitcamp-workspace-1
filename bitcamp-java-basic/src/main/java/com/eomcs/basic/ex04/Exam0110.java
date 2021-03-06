// 주제 : 변수선언
// - 데이터를 저장할 메모리를 확보하는 명령

package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i; 
    int i2;
    int i3;
    int x, y, z;
    
    i = 100;
    x = i;
    y = i * x;
    
    byte b1 = 10; // [00001010]
    byte b2 = 12; // [00001100]
    b1 = b2;      
    
    i = b1; // [00000000000000000000000000001100] <= 작은 메모리의값을 큰메모리에 넣으면 앞자리를 0으채운다;
    // b2 = i; 컴파일 오류발생  <=  큰메모리는 보다작은 메모리에 저장할 수 없다;
    b2 = (byte)i; //강제로 작은메모리로 이동시킬 경우
    
    int a = 100;
    int b = 200; // 한번에 메모리와 리터럴을 저장하는 방법도 가능.
    int aa, bb = 100, cc = 200, dd; // <-이런식으로 설정도 가능 여러가지한번에 [;이전은 한문장이다]
    
  
  }
}
// l-value 에는 리터럴을 저장할 수없다.
// r-value 에는 표현식 리터럴이 올 수 있다.
//      ex) x = 20+30;
// 표현식 리터럴 : 결과를 생성하는 리턴 문장.
// 명령어는 순서대로 