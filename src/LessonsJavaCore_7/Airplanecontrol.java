package LessonsJavaCore_7;

import java.util.Random;

public class Airplanecontrol {
    Random random = new Random ( );

    public void MovementUp ( ) {
        int movementUp = random.nextInt ( 80 ) + 50;
        System.out.println ( " Рух Верх " + movementUp );
    }

    public void MovementDown ( ) {
        int movementDown = random.nextInt ( 70 ) + 40;
        System.out.println ( "Рух Вниз " + movementDown );
    }

    public void MovementBack ( ) {
        int movementBack = random.nextInt ( 40 ) + 10;
        System.out.println ( "Рух Назад " + movementBack );
    }

    public void MovementForward ( ) {
        int movementForward = random.nextInt ( 100 ) + 60;
        System.out.println ( "Рух Вперед " + movementForward );
    }
}
