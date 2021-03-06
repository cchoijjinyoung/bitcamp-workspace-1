package com.mini.project.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import com.mini.project.domain.Member;
import com.mini.project.domain.Todo;

public class MainScreenCommand implements Command {

  List<Todo> todoList;
  Todo todo;
  public MainScreenCommand() {

  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Member member) {

    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date2 = new SimpleDateFormat("HH : mm");

    Calendar time = Calendar.getInstance();
    String date = date1.format(time.getTime());
    String timeNow = date2.format(time.getTime());
    out.println("==============================");
    out.printf("%s          %s\n", date, timeNow);
    out.println("==============================");
    getTimeScreen(out, in, timeNow);
    out.println("============================");
    out.printf("%15s\n",member.getStatus());
    out.println("============================");
    out.printf("%s님, 총 %d개의 할 일이 남았습니다.\n", member.getName(), member.getTodoList().size());
    out.println("============================");
    for (Todo todo : member.getTodoList()) {
      out.println(todo);
    }

    out.println("============================");

  }

  public int calcHowManyTodo(List<Todo> list) {
    //for (int i = )

    return 0;
  }


  public void getTimeScreen(PrintWriter out, BufferedReader in, String timeNow) {
    int hour = Integer.parseInt(timeNow.substring(0, 2));
    if (12 <= hour && hour < 18) {
      out.println("           \\  ,  /");
      out.println("        ' ,___/_\\___, '");
      out.println("          \\ /o.o\\ /");
      out.println("      -=   > \\__/ <   =-");
      out.println("          /_\\___/_\\");
      out.println("       . `   \\ /   ` .");
      out.println("            /  `  \\");
    } else if(0 <= hour && hour < 6) {
      out.println("☆.。.:*・°☆.。.:*・°");
      out.println("     ☆.。.:*・°☆.。.:*・°");
      out.println("☆.。.:*・°☆.。.:*・°");
      out.println("`");
      out.println("`");
      out.println("`            (¦ꀝ▓▓]`");
      out.println("`");
    } else if (6 <= hour && hour < 12) {
      out.println("           |");
      out.println(" _.---.  \\ _ /");
      out.println("(_._ ) )---(_) =-");
      out.println("  '---'.__   \\");
      out.println("            |");
      out.println("");
      out.println(" -^~^~|\\ ~^-~^~-");
    } else {
      out.println("              ___");
      out.println("      ~*    .'`  _\\");
      out.println("           /  (o/       *");
      out.println("*         |      _\\           *");
      out.println("           \\  '==.    *");
      out.println("        *   '.____\\       ~*");
    }
  }

  public static void mainMorning() throws InterruptedException {
    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date2 = new SimpleDateFormat("HH : mm");

    Calendar time = Calendar.getInstance();
    String date = date1.format(time.getTime());
    String timeNow = date2.format(time.getTime());


  }
}
