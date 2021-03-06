package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// Stateful 통신
// => 클라이언트가 연결되면 클라이언트가 보낸 메시지를 그대로 리턴해준다.
// => 클라이언트의 요청을 처리한 후 종료하지 않고 다음 요청을 진행한다.
// => 클라이언트가 quit 명령을 보내면 응답한 후 연결을 끊는다.
// => 응답의 끝에는 빈 줄을 보내도록 응답 프로토콜을 정의한다.
//  - 프로토콜이란 ? 클라이언트/서버 간의 데이터를 주고받는 형식이다.
// => 클라이언트 연결이 끊어지면 다음 클라이언트와 연결하는것을 반복한다.

public class ServerApp_v1 {

  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      while(true) {
        Socket clientSocket = serverSocket.accept();
        new Thread(new Runnable() { // 스레드객체를 만들면서 익명클래스를 선언했음
          @Override
          public void run() {
            InetAddress address = clientSocket.getInetAddress();
            System.out.printf("클라이언트(%s)와 연결되었습니다.\n ",address.getHostAddress());

            try (Socket socket = clientSocket;
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream());) {

              while (true) {
                String request = in.readLine();

                sendResponse(out, request);

                if(request.equalsIgnoreCase("quit"))
                  break;
              }
            } catch (Exception e) {
              System.out.println("클라이언트와 대화도중 예외 발생");
            }
            System.out.printf("클라이언트(%s)와 연결을 끊었습니다..\n ",address.getHostAddress());

          }

          private void sendResponse(PrintWriter out, String message) {
            out.print(message);
            out.println(); // 응답의 끝에는 응답이 끝났음을 알리는 빈줄을 보낸다.

            out.flush();
          }

        }).start();

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

