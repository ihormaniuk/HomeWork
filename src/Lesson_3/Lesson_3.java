package Lesson_3;

import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class Lesson_3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        print( "Введіть день тижня" );
        String day = scanner.nextLine ( );
        switch ( day ) {
            case "Понеділок":
                print ( "Понеділок" );
                print ( "Зустріч" );
                break;
            case "Вівторок":
                print ( "Вівторок" );
                print ( "Вечеря" );
                break;
            case "Середа":
                print ( "Середа" );
                print ( "Зателефонувати Андрію" );
                break;
            case "Четверг":
                print ( "Четверг" );
                print ( "Відрядження" );
                break;
            case "Пятнця":
                print ( "Пятнця" );
                print ( "Перерахунок" );
                break;
            case "Субота":
                print ( "Субота" );
                print ( "Вихідний" );
                break;
            case "Неділя":
                print ( "Неділя" );
                print ( "Вихідний" );
                break;
            default:
                print ( "Веденно невірне значеня" );
        }
    }
}
