package LessonsJavaCore_11.Auto;

public class Engine{
    private int numberOfCylinders;

    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }
    public Engine(){
    }

    public Engine(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }

    public String toString(){
        return "Number Of Cylinders : " + numberOfCylinders;
    }
}
