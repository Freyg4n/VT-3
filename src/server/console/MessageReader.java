package server.console;

import server.service.ServerLogic;

import java.io.IOException;
import java.util.Scanner;

public class MessageReader extends Thread{
    Scanner scan;
    ServerLogic serverLogic;

    public MessageReader(ServerLogic serverLogic){
        this.serverLogic = serverLogic;
        scan = new Scanner(System.in);
    }

    public void run(){
        String command = scan.next();
        if (command.equals("STOP")) {
            try {
                serverLogic.stopConnection();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
