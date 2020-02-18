package LessonsJavaCore_3;

import static MyClassesToWork.Print.print;

public class LessonCircleMain {
    public static void main(String[] args){
        print ( "ведіть радіус" );
        LessonCircle circle = new LessonCircle ();
        circle.scanner.nextLine ();
        print ( "діаметер - "  + circle.diameter () );
        print ("площа - " + circle.area () );
        print ( "довжина - " + circle.length () );
    }
}
