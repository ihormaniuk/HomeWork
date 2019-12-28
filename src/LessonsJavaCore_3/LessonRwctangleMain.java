package LessonsJavaCore_3;

public class LessonRwctangleMain {
    public static void main ( String[] args ) {
        System.out.println ( "Ведіть довжину і ширину" );
        LessonRectangle lessonRectangle = new LessonRectangle ();
        System.out.println ( "Площа прямокутника =  " + lessonRectangle.area () );
        System.out.println ( "Периметр прямокутника =" + lessonRectangle.perimeter () );
    }
}
