package LessonsJavaCore_3;

import static MyClassesToWork.Print.print;

public class LessonRwctangleMain {
    public static void main ( String[] args ) {
        print ( "Ведіть довжину і ширину" );
        LessonRectangle lessonRectangle = new LessonRectangle ();
        print ( "Площа прямокутника =  " + lessonRectangle.area () );
        print ( "Периметр прямокутника =" + lessonRectangle.perimeter () );
    }
}
