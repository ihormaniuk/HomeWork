package Lesson_2;

import static MyClassesToWork.Print.print;

public class lesson_2 {
    public static void main ( String[] args ) {
        int a = 10;
        int b = 9;
        int c = 8;
        int d = ( b * b ) - ( 4 * a * c );
        if ( d > 0 ) {
            double x1, x2;
            x1 = ( - b + Math.sqrt ( d ) ) / ( 2 * a );
            x2 = ( - b - Math.sqrt ( d ) ) / ( 2 * a );
            print ( "Two roots: " + ( ( x1 > x2 ) ? x2 : x1 ) + " " + ( ( x1 > x2 ) ? x1 : x2 ) );
        } else if ( d == 0 ) {
            print ( "One root: " + ( - b / ( 2 * a ) ) );
        } else {
            print ( "No roots" );
        }
    }
}
