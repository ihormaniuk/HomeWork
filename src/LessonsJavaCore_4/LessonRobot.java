package LessonsJavaCore_4;

public class LessonRobot {
    public void work(){
        System.out.println ( "Я Robot – я просто працюю" );

    }
}
class CoffeRobot extends LessonRobot {
    @Override
    public void work() {
        System.out.println ( "Я CoffeRobot – я варю каву" );

    }
}
class RobotDancer extends LessonRobot {
    @Override
    public void work() {
        System.out.println ( "Я RobotDancer – я просто танцюю" );

    }
}
class RobotCoocker extends LessonRobot {
    @Override
    public void work() {
        System.out.println ( "Я RobotCoocker – я просто готую" );
    }
}
