package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.prompt1;

public class MemberHandler1 {

  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registerdDate;
  }
  final static int LENGTH = 100;
  static Member[] list = new Member[LENGTH];
  static int size;

  public static void add() {
    System.out.println("[새로운 회원 정보]");
    Member m = new Member();
    m.no = prompt1.inputInt("번호?");
    m.name = prompt1.inputString("이름?");
    m.email = prompt1.inputString("이메일?");
    m.password = prompt1.inputString("비밀번호?");
    m.photo = prompt1.inputString("사진?");
    m.tel = prompt1.inputString("전화번호?");
    m.registerdDate = new java.sql.Date(System.currentTimeMillis());
    list[size++] = m;
  }
  public static void list() {
    System.out.println("[회원 목록]");
    for(int i = 0; i < size; i++) {
      Member m = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", m.no, m.name, m.email, m.tel, m.registerdDate);
    }
  }
}