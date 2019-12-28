package LessonsJavaCore_8;

import LessonsJavaCore_8.Local.Eng.ConsoleEng;
import LessonsJavaCore_8.Local.Ua.ConsoleUa;

import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        ConsoleUa consoleUa = new ConsoleUa ();
        ConsoleEng consoleEng = new ConsoleEng ();
        System.out.println ( "\n" +
                "***** Виберіть Мову *****\n" +
                "***** Select Language *****\n" +
                "***** 1 - Українська *****\n" +
                "***** 2 - English *****" );
        int number = scanner.nextInt ();
        switch ( number ){
            case 1:{
                System.out.println("***** Українська *****");
                consoleUa.Console ();
            }
            case 2:{
                System.out.println ("***** English *****");
                consoleEng.Console ();
            }
        }
    }
}
