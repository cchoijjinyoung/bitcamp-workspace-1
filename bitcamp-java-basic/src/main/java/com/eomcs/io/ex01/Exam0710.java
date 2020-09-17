// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710 {

  public static void main(String[] args) throws Exception {

    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    // 2) 디렉토리 안의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
    // 3) 하위 디렉토리의 파일 및 디렉토리 목록도 출력한다.
    // 4) 파일을 구분하기 위한 인덴트를 추가한다.
    // 5) 인덴트 처리부분을 별도의 메서드로 추출한다.

    File dir = new File(".");
    printFiles(dir, 0);
  }

  static void printFiles(File dir, int level) {

    File[] files = dir.listFiles();

    for(File file : files) {
      printIndent(level);
      System.out.println(file.getName());

      if(file.isDirectory()) {
        printFiles(file, level + 1);
      }

    }
  }
  static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
    System.out.print("|--");
  }
}
