package LessonsJavaCore_11.Auto;

public class Auto implements Comparable <Auto> {
    private int numbersOfHorsePower;
    private int yearRelease;
    private Engine engine;
    private Helm helm;

    public int getNumbersOfHorsePower(){
        return numbersOfHorsePower;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public Engine getEngine() {
        return engine;
    }

    public Helm getHelm() {
        return helm;
    }

    public Auto(){

    }

    public Auto(int numbersOfHorsePower){
        this.numbersOfHorsePower = numbersOfHorsePower;
    }

    public Auto(int numbersOfHorsePower,int yearRelease){
        this.numbersOfHorsePower = numbersOfHorsePower;
        this.yearRelease = yearRelease;
    }

    public Auto(int numbersOfHorsePower,int yearRelease,Engine engine,Helm helm){
        this.numbersOfHorsePower = numbersOfHorsePower;
        this.yearRelease = yearRelease;
        this.engine = engine;
        this.helm = helm;
    }

    public String toString(){
        return "Number Of Horse Power : " + numbersOfHorsePower + " , " + "Year Release : " + yearRelease + "\n" +
                "Engine Number Cylinders : " + engine.getNumberOfCylinders() + " \n" +
                "Helm Diameter : " + helm.getDiameterHelm() + " , " + "Helm Material : " + helm.getMaterialHelm();
    }

    @Override
    public int compareTo(Auto auto){
        int numberPowerCompare = Integer.compare(this.numbersOfHorsePower,auto.numbersOfHorsePower);
        return numberPowerCompare;
    }
}
