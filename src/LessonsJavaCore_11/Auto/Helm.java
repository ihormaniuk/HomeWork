package LessonsJavaCore_11.Auto;

public class Helm {
    private int diameterHelm;
    private String materialHelm;

    public int getDiameterHelm(){
        return diameterHelm;
    }

    public String getMaterialHelm(){
        return materialHelm;
    }

    public Helm(){

    }

    public Helm(int diameterHelm){
        this.diameterHelm = diameterHelm;
    }

    public Helm(String materialHelm){
        this.materialHelm = materialHelm;
    }

    public Helm(int diameterHelm,String materialHelm){
        this.diameterHelm = diameterHelm;
        this.materialHelm = materialHelm;
    }

    public String toString(int diameterHelm,String materialHelm){
        return "Diameter Helm : " + diameterHelm + " , " + "Material Helm : " + materialHelm;
    }
}
