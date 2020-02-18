package LessonsJavaCore_5;

public class constructor {
    private String overloading;

    public constructor (){

    }

    public constructor(String overloading){
        this.overloading = overloading;
    }

    public String getConstructor ( ) {
        return overloading;
    }

    public void setConstructor ( String overloading ) {
        this.overloading = overloading;
    }
}
