package com.eomcs.pms;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Picture {

  public static void startScreen() throws InterruptedException {
    System.out.println("===========================================================");
    System.out.println("====OOOOOOOO======OOOOOO=======OOOOOOOO=========OOOOOO=====");
    Thread.sleep(300);
    System.out.println("=======OO=======OOO====OOO=====OO====OOO======OOO====OOO===");
    System.out.println("=======OO======OOO======OOO====OO======OO====OOO======OOO==");
    Thread.sleep(300);
    System.out.println("=======OO======OOO======OOO====OO======OO====OOO======OOO==");
    System.out.println("=======OO=======OOO====OOO=====OO====OOO======OOO====OOO===");
    Thread.sleep(300);
    System.out.println("=======OO=========OOOOOO=======OOOOOOOO=========OOOOOO=====");
    System.out.println("===========================================================");
    Thread.sleep(300);
    System.out.println("===========OO=========OOOOOO=====OOOOOO=====OOOOOOOO=======");
    System.out.println("===========OO===========OO=====OOOO============OO==========");
    Thread.sleep(300);
    System.out.println("===========OO===========OO=======OOOOO=========OO==========");
    System.out.println("===========OO===========OO==========OOOOO======OO==========");
    Thread.sleep(300);
    System.out.println("===========OO===========OO=========OOOO========OO==========");
    System.out.println("===========OOOOOOOO===OOOOOO====OOOOOO=========OO==========");
    Thread.sleep(300);
    System.out.println("===========================================================");
    System.out.println("=====================*******************===================");
    Thread.sleep(300);
    System.out.println("=====================로그인==||=회원가입===================");
    System.out.println("=====================*******************===================");
    Thread.sleep(300);
    System.out.println("===========================================================");
    System.out.println("===========================================================");
  }
  public static void mainMorning() throws InterruptedException {
    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date2 = new SimpleDateFormat("HH : mm");

    Calendar time = Calendar.getInstance();
    String date = date1.format(time.getTime());
    String timeNow = date2.format(time.getTime());


    System.out.println("===================================");
    System.out.printf("%s                 %s\n", date, timeNow);
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("           \\  ,  /");
    Thread.sleep(300);
    System.out.println("        ' ,___/_\\___, '");
    System.out.println("          \\ /o.o\\ /");
    Thread.sleep(300);
    System.out.println("      -=   > \\__/ <   =-");
    System.out.println("          /_\\___/_\\");
    Thread.sleep(300);
    System.out.println("       . `   \\ /   ` .");
    System.out.println("            /  `  \\");
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("===================================");
    System.out.println("===================================");
  }
  public static void mainNight() throws InterruptedException {
    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date2 = new SimpleDateFormat("HH : mm");

    Calendar time = Calendar.getInstance();
    String date = date1.format(time.getTime());
    String timeNow = date2.format(time.getTime());


    System.out.println("===================================");
    System.out.printf("%s                 %s\n", date, timeNow);
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("              ___");
    Thread.sleep(300);
    System.out.println("      ~*    .'`  _\\");
    System.out.println("           /  (o/       *");
    Thread.sleep(300);
    System.out.println("*         |      _\\           *");
    System.out.println("           \\  '==.    *");
    Thread.sleep(300);
    System.out.println("        *   '.____\\       ~*");
    System.out.println();
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("===================================");
    System.out.println("===================================");
  }
  public static void menuScreen() throws InterruptedException {
    System.out.println("===================================");
    System.out.println("==============일정완료=============");
    System.out.println("-----------------------------------");
    System.out.println("----일정추가---- * ----일정조회----");
    System.out.println("----일정수정---- * ----일정삭제----");
    System.out.println("-----------------------------------");
  }
  public static void weeksReport() throws InterruptedException {

    System.out.println("===================================");
    System.out.println("       %s님의 일주일       ");
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("===================================");
    Thread.sleep(300);
    System.out.println("  %s님은 이번 한주간       ");
    System.out.println("  '%s'을 가장 많이하셨네요!");
    System.out.println("  '%s'을 좀더 열심히 하세요 !!");
    Thread.sleep(300);
    System.out.println("         .-----.");
    System.out.println("        |.-----.|");
    System.out.println("        ||x . x||");
    Thread.sleep(300);
    System.out.println("        ||_.-._||");
    System.out.println("        `--)-(--`");
    Thread.sleep(300);
    System.out.println("       __[=== o]___\'");
    System.out.println("       |:::::::::::|\'");
    System.out.println("       `-=========-`()");
    Thread.sleep(300);
    System.out.println("===================================");
    System.out.println("어학==||============================");
    System.out.println("운동==||===========================");
    Thread.sleep(300);
    System.out.println("코딩==||===========================");
    System.out.println("독서==||===========================");
    System.out.println("===================================");
  }



}