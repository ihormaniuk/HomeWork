package LessonsJavaCore_3;

public class LessonCircleMain {
    public static void main(String[] args){
        System.out.println ( "ведіть радіус" );
        LessonCircle circle = new LessonCircle ();
        circle.scanner.nextLine ();
        System.out.println ( "діаметер - "  + circle.diameter () );
        System.out.println ("площа - " + circle.area () );
        System.out.println ( "довжина - " + circle.length () );
    }
}
