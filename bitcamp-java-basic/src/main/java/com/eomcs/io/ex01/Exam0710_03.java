// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_03 {

  public static void main(String[] args) throws Exception {

    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    // 2) 디렉토리 안의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
    // 3) 하위 디렉토리의 파일 및 디렉토리 목록도 출력한다.

    File dir = new File(".");
    printFiles(dir);
  }

  static void printFiles(File dir) {

    File[] files = dir.listFiles();

    for(File file : files) {
      System.out.println(file.getName());

      //(재귀호출)
      if(file.isDirectory()) {
        printFiles(file);
      }

    }
  }
}