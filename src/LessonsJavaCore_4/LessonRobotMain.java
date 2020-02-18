package LessonsJavaCore_4;

public class LessonRobotMain {
    public static void main(String[] args){
        int id = 0;
        LessonRobot robot = new LessonRobot ();
        robot.work ();
        CoffeRobot coffeRobot = new CoffeRobot ();
        coffeRobot.work ();
        RobotDancer robotDancer = new RobotDancer ();
        robotDancer.work ();
        RobotCoocker robotCoocker = new RobotCoocker ();
        robotCoocker.work ();
        System.out.println ( "-----------------------------------------" );
        System.out.println ( " Це масив Класу - Robot і його нащадків " );
        System.out.println ( "-----------------------------------------" );
        System.out.println ( "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓" );
        System.out.println (  );
        LessonRobot[] robots = {robot,coffeRobot,robotDancer,robotCoocker};
        for ( LessonRobot lessonRobot : robots ){
            System.out.println(" Number Robot : "+ id++ + " : "+ lessonRobot);
        }
    }
}
