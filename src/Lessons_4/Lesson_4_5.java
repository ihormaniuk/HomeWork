package Lessons_4;

public class Lesson_4_5 {
    public static void main ( String[] args ) {
        int[] number = {1, 22, 56, 686, 2, 4, 6, 7, 89, 33, 3, 4, 6, 9, 7, 34, 5, 2, 1, 9};
        int a = number[0];
        int b = number[0];
        for ( int i = 0 ; i < number.length ; i++ ) {
            if ( number[i] >= a ) {
                a = number[i];
            }
        }
        for ( int i = 0 ; i < number.length ; i++ ) {
            if ( number[i] <= b ) {
                b = number[i];
            }
        }
        System.out.println ( a );
        System.out.println ( b );
    }
}
