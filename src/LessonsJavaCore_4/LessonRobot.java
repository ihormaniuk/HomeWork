package LessonsJavaCore_4;

public class LessonRobot {
    String speakWork = "Я Robot – я просто працюю";
    public String toString(){
        return speakWork;
    }
    public void work(){
        System.out.println ( speakWork );
    }
}
class CoffeRobot extends LessonRobot {
    @Override
    public String toString ( ) {
        return "Я CoffeRobot – я варю каву";
    }
    @Override
    public void work() {
        System.out.println ( toString () );

    }
}
class RobotDancer extends LessonRobot {
    @Override
    public String toString ( ) {
        return "Я RobotDancer – я просто танцюю";
    }
    @Override
    public void work() {
        System.out.println ( toString ());
    }
}
class RobotCoocker extends LessonRobot {
    @Override
    public String toString ( ) {
        return "Я RobotCoocker – я просто готую";
    }
    @Override
    public void work() {
        System.out.println ( toString ());
    }
}