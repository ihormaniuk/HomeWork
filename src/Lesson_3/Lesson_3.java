package Lesson_3;

import java.util.Scanner;

public class Lesson_3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введіть день тижня" );
        String day = scanner.nextLine ( );
        switch ( day ) {
            case "Понеділок":
                System.out.println ( "Понеділок" );
                System.out.println ( "Зустріч" );
                break;
            case "Вівторок":
                System.out.println ( "Вівторок" );
                System.out.println ( "Вечеря" );
                break;
            case "Середа":
                System.out.println ( "Середа" );
                System.out.println ( "Зателефонувати Андрію" );
                break;
            case "Четверг":
                System.out.println ( "Четверг" );
                System.out.println ( "Відрядження" );
                break;
            case "Пятнця":
                System.out.println ( "Пятнця" );
                System.out.println ( "Перерахунок" );
                break;
            case "Субота":
                System.out.println ( "Субота" );
                System.out.println ( "Вихідний" );
                break;
            case "Неділя":
                System.out.println ( "Неділя" );
                System.out.println ( "Вихідний" );
                break;
            default:
                System.out.println ( "Веденно невірне значеня" );
        }
    }
}
