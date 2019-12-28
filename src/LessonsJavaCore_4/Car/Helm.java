package LessonsJavaCore_4.Car;

public class Helm {
    private int DiameterHelm = 10;
    private String MaterialHelm = "Metal";

    @Override
    public String toString ( ) {
        return " Діаметер Керма " + DiameterHelm + " - " + "Матеріали Керма" + MaterialHelm ;
    }

    public int getDiameterHelm ( ) {
        return DiameterHelm;
    }

    public void setDiameterHelm ( int diameterHelm ) {
        DiameterHelm = diameterHelm;
    }

    public String getMaterialHelm ( ) {
        return MaterialHelm;
    }

    public void setMaterialHelm ( String materialHelm ) {
        MaterialHelm = materialHelm;
    }
}
