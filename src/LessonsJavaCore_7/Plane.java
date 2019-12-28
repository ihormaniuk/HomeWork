package LessonsJavaCore_7;

import java.util.Random;

public abstract class Plane {
    private int Length = 250;
    private int Width = 20;
    private int Weight = 170;

    protected Plane ( ) {
    }

    @Override
    public String toString ( ) {
        return " Довжина - " + Length + " - " + " ширина - " + Width + " вага - " + Weight;
    }

    public int getLength ( ) {
        return Length;
    }

    public void setLength ( int length ) {
        Length = length;
    }

    public int getWidth ( ) {
        return Width;
    }

    public void setWidth ( int width ) {
        Width = width;
    }

    public int getWeight ( ) {
        return Weight;
    }

    public void setWeight ( int weight ) {
        Weight = weight;
    }

    public Plane( int Length, int Width, int Weight){
      this.Length = Length;
      this.Width = Width;
      this.Weight = Weight;
    }

    Random ramdom = new Random (  );

    public void StartingEngines(){
        int startingEngines = ramdom.nextInt (20) + 10;
        System.out.println(" Часу залишилось до готовності взлетіти - " + startingEngines);
    }
    public void  TakeoffAircraft(){
        int takeoffAircraft = ramdom.nextInt (0) + 1000;
        System.out.println ("Літак пролетить на повному бацу - " + takeoffAircraft );
    }
    public void LandingAircraft(){
        System.out.println ( "Літак іде на Посадку " );
    }
}
