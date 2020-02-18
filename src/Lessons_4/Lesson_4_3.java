package Lessons_4;

import java.util.Scanner;

import static MyClassesToWork.Print.print;

public class Lesson_4_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        print ( "Ведіть Число " );
        int a = scanner.nextInt( );
        if ( ( a % 2 ) == 0 ) {
            print ( "Число " + a + " парне" );
        } else {
            if ( ( a % 1 ) == 0 ) {
                print ( "Число " + a + " не парне" );
                {

                }
            }
        }
    }
}
