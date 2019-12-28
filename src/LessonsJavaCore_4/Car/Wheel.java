package LessonsJavaCore_4.Car;

public class Wheel {
    private int DiameterWhelm = 16;
    private String TypeWheel = "Titans";

    @Override
    public String toString ( ) {
        return "Розмір колеса " + DiameterWhelm + " - " + " Тип Колеса " + TypeWheel ;
    }

    public int getDiameterWhelm ( ) {
        return DiameterWhelm;
    }

    public void setDiameterWhelm ( int diameterWhelm ) {
        this.DiameterWhelm = diameterWhelm;
    }

    public String getMTypeWheel ( ) {
        return TypeWheel;
    }

    public void setTypeWheel ( String TypeWheel ) {
        this.TypeWheel = TypeWheel;
    }
}
