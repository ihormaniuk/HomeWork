package LessonsJavaCore_8;

import LessonsJavaCore_8.Local.Eng.ConsoleEng;
import LessonsJavaCore_8.Local.Ua.ConsoleUa;
import LessonsJavaCore_9.WrongInputConsoleParametersException;

import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        ConsoleUa consoleUa = new ConsoleUa ();
        ConsoleEng consoleEng = new ConsoleEng ();
        String s = "";
        System.out.println ( "\n" +
                "***** Виберіть Мову *****\n" +
                "***** Select Language *****\n" +
                "***** 1 - Українська *****\n" +
                "***** 2 - English *****" );

        Integer number = scanner.nextInt ();
        if(number.equals(s)){
            try {
                throw new WrongInputConsoleParametersException ("ведіть цифри");
            }catch (WrongInputConsoleParametersException parameter){
                parameter.getMessage ("ведіть цифри");
            }
        }
        switch ( number ){
            case 1:{
                System.out.println("***** Українська *****");
                consoleUa.Console ();
                break;
            }
            case 2:{
                System.out.println ("***** English *****");
                consoleEng.Console ();
                break;
            }
            case 11:{
                break;
            }
        }
    }
}
