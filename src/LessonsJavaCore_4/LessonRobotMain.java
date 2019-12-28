package LessonsJavaCore_4;

public class LessonRobotMain {
    public static void main(String[] args){
        LessonRobot robot = new LessonRobot ();
        robot.work ();
        CoffeRobot coffeRobot = new CoffeRobot ();
        coffeRobot.work ();
        RobotDancer robotDancer = new RobotDancer ();
        robotDancer.work ();
        RobotCoocker robotCoocker = new RobotCoocker ();
        robotCoocker.work ();
        LessonRobot[] robots = {robot,coffeRobot,robotDancer,robotCoocker};
        for ( int i = 0;i < 4;i++ ){
            System.out.println(robots[i]);
        }
    }
}
