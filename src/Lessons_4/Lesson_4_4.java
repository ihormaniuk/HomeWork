package Lessons_4;

import static MyClassesToWork.Print.print;

public class Lesson_4_4 {
    public static void main ( String[] args ) {
        double n = 8.55;
        double m = 11.50;
        int a = 10;
        double b = Math.abs( a - n );
        double c = Math.abs( a - m );
        if ( b == c ) {
            print ( " Число " + n + " і " + m + " рівнні " + a );
        }
        if ( b > c ) {
            print ( " Число " + m + " блище до " + a );
        }
        if ( b < c ) {
            print ( "Число " + n + " блище до " + a );
        }
    }
}
