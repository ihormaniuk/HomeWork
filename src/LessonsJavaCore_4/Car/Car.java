package LessonsJavaCore_4.Car;

public class Car {
    private String salonMaterials;
    Body body = new Body ();
    Wheel wheel = new Wheel ();
    Helm helm = new Helm ();

    public String getSalonMaterials ( ) {
        return salonMaterials;
    }

    public void setSalonMaterials ( String salonMaterials ) {
        this.salonMaterials = salonMaterials;
    }
}
