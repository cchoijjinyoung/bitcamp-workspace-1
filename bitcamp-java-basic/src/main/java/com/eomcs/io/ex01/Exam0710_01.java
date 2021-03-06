// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_01 {

  public static void main(String[] args) throws Exception {

    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력

    File dir = new File(".");
    File[] files = dir.listFiles();

    for(File file : files) {
      System.out.println(file.getName());
    }

  }
}