package Lessons_4;

public class Lesson_4_4 {
    public static void main ( String[] args ) {
        double n = 8.5;
        double m = 11.45;
        int a = 10;
        double b = Math.abs( a - n );
        double c = Math.abs( a - m );
        if ( b == c ) {
            System.out.println( " Число " + n + " і " + m + " рівнні " + a );
        }
        if ( b > c ) {
            System.out.println( " Число " + m + " блище до " + a );
        }
        if ( b < c ) {
            System.out.println( "Число " + n + " блище до " + a );
        }
    }
}
