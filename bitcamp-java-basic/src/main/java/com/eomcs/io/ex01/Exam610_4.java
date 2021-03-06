package com.eomcs.io.ex01;

import java.io.File;

public class Exam610_4 {
  public static void main(String[] args) {
    // 1) 현재 폴더의 모든 파일 또는 모든 디렉토리 이름을 출력하라!
    // 2) 파일 이름 뿐만아니라 디렉토리일 경우 d 파일일 경우 -를 앞에 출력하라.
    // 3) 파일의 크기를 출력하라.
    // 4) 파일의 크기를 출력할 때 10자리로 고정하라.
    File file = new File(".");
    File[] files = file.listFiles();
    for (File f : files) {
      System.out.printf("%s %10d %s\n",
          f.isDirectory() ? "d" : "-",
              f.length(),
              f.getName());
    }
  }
}
