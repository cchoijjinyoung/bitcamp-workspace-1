package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project {
      int no;
      String name;
      String content;
      Date startDate;
      Date endDate;
      String producer;
      String cooperator;
    }
    final int MAX_LENGTH = 100;
    int count = 0;
    Project[] projects = new Project[MAX_LENGTH];
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[프로젝트]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Project p = new Project();
      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("프로젝트명? ");
      p.name = keyInput.nextLine();
      System.out.print("내용? ");
      p.content = keyInput.nextLine();
      System.out.print("시작일? ");
      p.startDate = Date.valueOf(keyInput.nextLine());
      System.out.print("종료일? ");
      p.endDate = Date.valueOf(keyInput.nextLine());
      System.out.print("만든이? ");
      p.producer = keyInput.nextLine();
      System.out.print("팀원? ");
      p.cooperator = keyInput.nextLine();

      projects[i] = p;

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    System.out.println("-------------------");
    for (int i = 0; i < count; i++) {
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.name, p.startDate, p.endDate, p.producer);
    }
  }
}
