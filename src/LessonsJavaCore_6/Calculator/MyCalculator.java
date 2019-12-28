package LessonsJavaCore_6.Calculator;

import java.util.Scanner;

public class MyCalculator implements Numerable {
    Scanner scanner = new Scanner ( System.in );
    @Override
    public void Devide ( ) {
        System.out.println ( "Ділення" );
        int a = scanner.nextInt ();
        System.out.println ( "/" );
        int b = scanner.nextInt ();
        System.out.println ( a / b );
    }

    @Override
    public void Minus ( ) {
        System.out.println ( "Віднімання" );
        int a = scanner.nextInt ();
        System.out.println ( "-" );
        int b = scanner.nextInt ();
        System.out.println ( a - b );
    }

    @Override
    public void Multiply ( ) {
        System.out.println ( "Множення" );
        int a = scanner.nextInt ();
        System.out.println ( "*" );
        int b = scanner.nextInt ();
        System.out.println ( a * b );
    }

    @Override
    public void Plus ( ) {
        System.out.println ( "Додавання" );
        int a = scanner.nextInt ();
        System.out.println ( "+" );
        int b = scanner.nextInt ();
        System.out.println ( a + b );
    }
}
