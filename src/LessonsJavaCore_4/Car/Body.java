package LessonsJavaCore_4.Car;

public class Body {
    private String MaterialBody = "Metal";
    private String ColorBody = "Black";

    @Override
    public String toString ( ) {
        return " Матеріали Кузова " + MaterialBody + " - " + "Колір Кузова" + ColorBody;
    }

    public String getMaterialBody ( ) {
        return MaterialBody;
    }

    public void setMaterialBody ( String materialBody ) {
        MaterialBody = materialBody;
    }

    public String getColorBody ( ) {
        return ColorBody;
    }

    public void setColorBody ( String colorBody ) {
        ColorBody = colorBody;
    }
}
