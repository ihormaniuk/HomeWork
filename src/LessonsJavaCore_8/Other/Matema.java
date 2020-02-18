package LessonsJavaCore_8.Other;

import java.util.Scanner;

public class Matema {
    public static void main(String[] args){
        Scanner scaner = new Scanner ( System.in );
        System.out.println ( "\n" +
                "                           *** Додавання ***\n" +
                "                                                               \n" +
                "" +
                "                 *** Число неповине перевищувати 100 ***\n" +
                "                                                               \n" +
                "" +
                "                        *** Ведіть перше число ***" );
        int a = scaner.nextInt ();
        if(a<=100){
            System.out.println (        "*** Ведіть друге число ***" );
            int b = scaner.nextInt ();
            if (b>100){
                System.out.println ( "---  Число перевищело 100 ---" );
            }
            if ( b<=100 ){
                System.out.println ( a + " + " + b + " = " + ( a+b ) );
            }
        }
        if ( a>100 ){
            System.out.println (     "---  Число перевищело 100 ---" );
        }
    }
}
